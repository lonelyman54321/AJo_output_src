/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.videoPlayer.ui;

import android.os.Bundle;
import com.google.gson.Gson;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import java.lang.reflect.Type;

public final class AjioVideoPlayerFullScreenFragment$a {
    public static AjioVideoPlayerFullScreenFragment a(BannerData object, String string2) {
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = new AjioVideoPlayerFullScreenFragment();
        Bundle bundle = new Bundle();
        Gson gson = new Gson();
        object = gson.toJson(object, (Type)((Object)BannerData.class));
        bundle.putString("banner_data", (String)object);
        bundle.putString("uuid", string2);
        ajioVideoPlayerFullScreenFragment.setArguments(bundle);
        return ajioVideoPlayerFullScreenFragment;
    }
}

