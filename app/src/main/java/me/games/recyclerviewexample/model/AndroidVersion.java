package me.games.recyclerviewexample.model;

/**
 * Created by darshanz on 7/1/15.
 */
public class AndroidVersion {
    private  String versionName;
    private String versionCode;
    private int apiLevel;
    private int versionImage;

    public AndroidVersion(String versionName, String versionCode, int apiLevel, int versionImage) {
        this.versionName = versionName;
        this.versionCode = versionCode;
        this.apiLevel = apiLevel;
        this.versionImage = versionImage;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public int getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(int apiLevel) {
        this.apiLevel = apiLevel;
    }

    public int getVersionImage() {
        return versionImage;
    }

    public void setVersionImage(int versionImage) {
        this.versionImage = versionImage;
    }
}
