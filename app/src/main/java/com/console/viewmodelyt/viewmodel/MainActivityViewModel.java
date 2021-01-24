package com.console.viewmodelyt.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.console.viewmodelyt.model.MainActivityModel;
import com.console.viewmodelyt.repository.Repository;

public class MainActivityViewModel extends ViewModel {
    //textview
    public MutableLiveData<String> add = new MutableLiveData<>();
    //model pojo na to
    public MutableLiveData<MainActivityModel> user = new MutableLiveData<>();
    private Repository repository; // for retrofit
//    private Context context;

    public void init(){
//        repositories = Repositories.getInstance(); //para maipasok at magawa retrofit
//        user.setValue(repositories.getUser()); //retrofit
//        this.context = context;
    }
    //set on click listener to
    Integer number = 0;
    public void addition(){
        number++;
        System.out.println("addition working");

        add.setValue(number.toString());
        
        if (number == 5){
            System.out.println("number is 5!");
            repository = Repository.getInstance(); //para maipasok at magawa retrofit
            user.setValue(repository.getUser()); //retrofit*/
        }
    }

    public MutableLiveData<String> getAdd() {
        return add;
    }
}
