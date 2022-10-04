package com.example.field;


import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;

import com.example.field.Adapters.video_item;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideosFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    View view;
    private ViewPager2 viewPager2;
    private SwipeRefreshLayout swipeRefreshLayout;
    public VideosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_videos, container, false);
        viewPager2 = view.findViewById(R.id.Page_id);
        swipeRefreshLayout = view.findViewById(R.id.fresh_id);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        init();

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void init() {

        List<video_item> VideoItem = new ArrayList<>();
        video_item videoItemCelebration = new video_item();
        videoItemCelebration.videoURL ="https://www.infinityandroid.com/videos/video1.mp4";
        videoItemCelebration.Videotitle = "Celebration";
        videoItemCelebration.VideoDescription = "";
        VideoItem.add(videoItemCelebration);

    }

    @Override
    public void onRefresh() {

    }
}
