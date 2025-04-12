/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.common.f;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$f;
import androidx.media3.ui.R$layout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;

public final class PlayerControlView$g
extends RecyclerView$f {
    public final String[] a;
    public final String[] b;
    public final Drawable[] c;
    public final /* synthetic */ PlayerControlView d;

    public PlayerControlView$g(PlayerControlView stringArray, String[] stringArray2, Drawable[] drawableArray) {
        this.d = stringArray;
        this.a = stringArray2;
        stringArray = new String[stringArray2.length];
        this.b = stringArray;
        this.c = drawableArray;
    }

    public final boolean g(int n3) {
        PlayerControlView playerControlView = this.d;
        f f5 = playerControlView.z0;
        boolean bl2 = false;
        if (f5 == null) {
            return false;
        }
        if (n3 != 0) {
            int n4;
            f f6;
            int n7 = 1;
            if (n3 != n7) {
                return n7;
            }
            n3 = (int)(f5.isCommandAvailable(30) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)((f6 = playerControlView.z0).isCommandAvailable(n4 = 29) ? 1 : 0)) != 0) {
                bl2 = true;
            }
            return bl2;
        }
        return f5.isCommandAvailable(13);
    }

    public final int getItemCount() {
        return this.a.length;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        TextView textView;
        Object object;
        Drawable[] drawableArray;
        recyclerView$B = (PlayerControlView$f)recyclerView$B;
        boolean bl2 = this.g(n3);
        if (bl2) {
            drawableArray = recyclerView$B.itemView;
            int n4 = -1;
            int n7 = -2;
            object = new RecyclerView$LayoutParams(n4, n7);
            drawableArray.setLayoutParams((ViewGroup.LayoutParams)object);
        } else {
            drawableArray = recyclerView$B.itemView;
            boolean bl3 = false;
            textView = null;
            object = new RecyclerView$LayoutParams(0, 0);
            drawableArray.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        drawableArray = ((PlayerControlView$f)recyclerView$B).a;
        object = this.a[n3];
        drawableArray.setText((CharSequence)object);
        drawableArray = this.b[n3];
        int n8 = 8;
        textView = ((PlayerControlView$f)recyclerView$B).b;
        if (drawableArray == null) {
            textView.setVisibility(n8);
        } else {
            textView.setText((CharSequence)drawableArray);
        }
        drawableArray = this.c;
        Drawable drawable2 = drawableArray[n3];
        recyclerView$B = ((PlayerControlView$f)recyclerView$B).c;
        if (drawable2 == null) {
            recyclerView$B.setVisibility(n8);
        } else {
            recyclerView$B.setImageDrawable(drawable2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        PlayerControlView playerControlView = this.d;
        Object object = LayoutInflater.from((Context)playerControlView.getContext());
        int n4 = R$layout.exo_styled_settings_list_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        object = new PlayerControlView$f(playerControlView, (View)viewGroup);
        return object;
    }
}

