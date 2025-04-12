/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.play.core.assetpacks;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.List;
import java.util.Map;

public interface AssetPackManager {
    public AssetPackStates cancel(List var1);

    public void clearListeners();

    public Task fetch(List var1);

    public AssetLocation getAssetLocation(String var1, String var2);

    public AssetPackLocation getPackLocation(String var1);

    public Map getPackLocations();

    public Task getPackStates(List var1);

    public void registerListener(AssetPackStateUpdateListener var1);

    public Task removePack(String var1);

    public Task showCellularDataConfirmation(Activity var1);

    public boolean showCellularDataConfirmation(I3 var1);

    public Task showConfirmationDialog(Activity var1);

    public boolean showConfirmationDialog(I3 var1);

    public void unregisterListener(AssetPackStateUpdateListener var1);
}

