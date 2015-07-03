package me.games.recyclerviewexample.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import me.games.recyclerviewexample.R;
import me.games.recyclerviewexample.model.AndroidVersion;

/**
 * Created by darshanz on 7/3/15.
 */
public class AndroidVersionAdapter extends RecyclerView.Adapter<AndroidVersionAdapter.VersionViewHolder> {


    ArrayList<AndroidVersion> mVersionList;

    public AndroidVersionAdapter(ArrayList<AndroidVersion> versionList) {
        mVersionList = versionList;
    }

    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.version_item, viewGroup, false);

        VersionViewHolder holder = new VersionViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(VersionViewHolder versionViewHolder, int position) {
        AndroidVersion version = mVersionList.get(position);

        versionViewHolder.versionName.setText(version.getVersionName());
        versionViewHolder.versionCode.setText(version.getVersionCode());
        versionViewHolder.apiLevel.setText("ApiLevel : "+version.getApiLevel());
        versionViewHolder.versionImage.setImageResource(version.getVersionImage());

    }

    @Override
    public int getItemCount() {
        return mVersionList.size();
    }



    //ViewHolder
    class VersionViewHolder extends RecyclerView.ViewHolder{
        TextView versionName;
        TextView versionCode;
        TextView apiLevel;
        ImageView versionImage;

        public VersionViewHolder(View itemView) {
            super(itemView);
            versionName = (TextView)itemView.findViewById(R.id.versionName);
            versionCode = (TextView)itemView.findViewById(R.id.versionCode);
            apiLevel = (TextView)itemView.findViewById(R.id.apiLevel);
            versionImage = (ImageView) itemView.findViewById(R.id.versionImage);
        }
    }
}
