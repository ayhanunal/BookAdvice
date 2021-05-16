package com.ayhanunal.bookadvice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ayhanunal.bookadvice.R
import com.ayhanunal.bookadvice.api.RetrofitAPIService
import com.ayhanunal.bookadvice.model.MainModel
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)




        val apiService = RetrofitAPIService()
        val disposable = CompositeDisposable()

        disposable.add(
            apiService.getData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<MainModel>(){
                    override fun onSuccess(t: MainModel) {
                        Log.e("result", t.crawl_date)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("status", e.localizedMessage)
                    }
                })
        )



        print("AAAAAAAA"+apiService.getData())



    }
}