/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.jio.jioads.videomodule.player;

import android.view.View;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import java.util.ArrayList;
import java.util.List;

public interface o {
    public void a();

    public void a(String var1);

    public void a(boolean var1);

    public void b();

    public void b(List var1);

    public JioPlayerState c();

    public void c(Integer var1);

    public String d();

    public void d(ArrayList var1, boolean var2);

    public void e();

    public void f();

    public View g();

    public int getCurrentPosition();

    public int getDuration();

    public Integer getVolume();

    public boolean isPlaying();

    public void pause();

    public void start();
}

