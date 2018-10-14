package com.example.ma.demomvp.screen.Category.Presenter;

import com.example.ma.demomvp.data.model.CategoryImage;
import com.example.ma.demomvp.data.repository.HomeRepository;
import com.example.ma.demomvp.data.source.CallBack;


import java.util.ArrayList;

public interface CategoryPresenter {
    void getCategoryList(HomeRepository homeRepository);
}
