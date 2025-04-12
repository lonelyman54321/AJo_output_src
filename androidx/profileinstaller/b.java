/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.os.Build$VERSION
 */
package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c$c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class b {
    public final Executor a;
    public final c$c b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public Rp0[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, c$c object, String string2, File file) {
        this.a = executor;
        this.b = object;
        this.e = string2;
        this.d = file;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        object = null;
        if (n3 >= n4) {
            n4 = 31;
            if (n3 >= n4) {
                object = mb2_0.a;
            } else {
                switch (n3) {
                    default: {
                        break;
                    }
                    case 28: 
                    case 29: 
                    case 30: {
                        object = mb2_0.b;
                        break;
                    }
                    case 27: {
                        object = mb2_0.c;
                        break;
                    }
                    case 26: {
                        object = mb2_0.d;
                        break;
                    }
                    case 24: 
                    case 25: {
                        object = mb2_0.e;
                    }
                }
            }
        }
        this.c = (byte[])object;
    }

    public final FileInputStream a(AssetManager object, String string2) {
        object = object.openFd(string2);
        try {
            object = object.createInputStream();
        }
        catch (FileNotFoundException fileNotFoundException) {
            boolean bl2;
            object = fileNotFoundException.getMessage();
            if (object != null && (bl2 = ((String)object).contains(string2 = "compressed"))) {
                object = this.b;
                object.getClass();
            }
            bl2 = false;
            object = null;
        }
        return object;
    }

    public final void b(int n3, Serializable serializable) {
        Op0 op0 = new Op0(this, n3, serializable);
        this.a.execute(op0);
    }
}

