/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.appcompat.app;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.g;

public final class AppCompatActivity$b
implements u82_0 {
    public final /* synthetic */ AppCompatActivity a;

    public AppCompatActivity$b(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    public final void a(Context object) {
        object = this.a;
        g g3 = ((AppCompatActivity)object).getDelegate();
        g3.i();
        ((ComponentActivity)object).getSavedStateRegistry().a("androidx:appcompat");
        g3.m();
    }
}

