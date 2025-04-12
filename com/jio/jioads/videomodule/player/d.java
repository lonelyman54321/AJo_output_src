/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.util.j;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ k a;

    public d(k k2) {
        this.a = k2;
    }

    public final boolean onError(MediaPlayer object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "mp");
        object = this.a;
        Object object2 = ((k)object).i;
        JioPlayerState jioPlayerState = JioPlayerState.ERROR;
        if (object2 == jioPlayerState) {
            return false;
        }
        object2 = new StringBuilder();
        b b2 = ((k)object).d;
        CharSequence charSequence = ": Media Player Error: Error code ";
        j_0.n(b2, (StringBuilder)object2, (String)charSequence);
        Object object3 = ((k)object).h;
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        j.b((String)object2);
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 100;
            if (n3 != n8) {
                object3 = new StringBuilder();
                String string2 = b2.P();
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append((String)charSequence);
                ((StringBuilder)object3).append(n3);
                ((StringBuilder)object3).append(". Extra: ");
                ((StringBuilder)object3).append(n4);
                charSequence = ((StringBuilder)object3).toString();
                j.b((String)charSequence);
            } else {
                charSequence = new StringBuilder();
                object3 = b2.P();
                ((StringBuilder)charSequence).append((String)object3);
                object3 = ": Media Player Error: Server died. Extra: ";
                ((StringBuilder)charSequence).append((String)object3);
                ((StringBuilder)charSequence).append(n4);
                charSequence = ((StringBuilder)charSequence).toString();
                j.b((String)charSequence);
            }
        } else {
            charSequence = new StringBuilder();
            object3 = b2.P();
            ((StringBuilder)charSequence).append((String)object3);
            object3 = ": Media Player Error: Unknown error occurred. Extra: ";
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append(n4);
            charSequence = ((StringBuilder)charSequence).toString();
            j.b((String)charSequence);
        }
        charSequence = new StringBuilder();
        object3 = b2.P();
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ": Error: ";
        ((StringBuilder)charSequence).append((String)object3);
        ((StringBuilder)charSequence).append(n3);
        n3 = 44;
        ((StringBuilder)charSequence).append((char)n3);
        ((StringBuilder)charSequence).append(n4);
        CharSequence charSequence2 = ((StringBuilder)charSequence).toString();
        j.a((String)charSequence2);
        ((k)object).i = jioPlayerState;
        object = ((k)object).c;
        if (object != null) {
            charSequence2 = new StringBuilder();
            String string3 = b2.P();
            ((StringBuilder)charSequence2).append(string3);
            string3 = ": onError: jioPlayerListener";
            ((StringBuilder)charSequence2).append(string3);
            charSequence2 = ((StringBuilder)charSequence2).toString();
            j.b((String)charSequence2);
            object.d();
        }
        return n7;
    }
}

