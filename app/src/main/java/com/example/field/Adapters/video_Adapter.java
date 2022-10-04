package com.example.field.Adapters;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

import java.util.List;

public class video_Adapter extends RecyclerView.Adapter<video_Adapter.videoViewHold> {

    private List<video_item> videoz;

    public video_Adapter(List<video_item> videoz) {
        this.videoz = videoz;
    }

    @NonNull
    @Override
    public videoViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new videoViewHold(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.container_video,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull videoViewHold holder, int position) {

        holder.setVideoData(videoz.get(position));
    }

    @Override
    public int getItemCount() {
        return videoz.size();
    }

    public static class videoViewHold extends RecyclerView.ViewHolder{

        public VideoView videoView;
        public TextView video_title,video_Desc;
        public videoViewHold(@NonNull View itemView) {
            super(itemView);

            videoView = itemView.findViewById(R.id.video_id);
            video_title = itemView.findViewById(R.id.text_video);
            video_Desc = itemView.findViewById(R.id.video_desc);

        }
        void setVideoData(video_item videos){
            video_title.setText(videos.Videotitle);
            video_Desc.setText(videos.VideoDescription);
            videoView.setVideoPath(videos.videoURL);
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {

                    mp.start();

                    float videoRatio = mp.getVideoWidth() / (float) mp.getVideoHeight();
                    float screenRatio = videoView.getWidth() / (float) videoView.getHeight();

                    float scale = videoRatio / screenRatio;
                    if (scale >= 1f){

                        videoView.setScaleX(scale);
                    }else {

                        videoView.setScaleY(1f/scale);
                    }
                }
            });

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                    mp.start();
                }
            });

        }
    }
}
