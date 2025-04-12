/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 */
package com.caverock.androidsvg;

import android.content.Context;
import android.os.AsyncTask;
import com.caverock.androidsvg.SVGImageView;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;

public final class SVGImageView$a
extends AsyncTask {
    public final Context a;
    public final int b;
    public final /* synthetic */ SVGImageView c;

    public SVGImageView$a(SVGImageView sVGImageView, Context context, int n3) {
        this.c = sVGImageView;
        this.a = context;
        this.b = n3;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object doInBackground(Object[] object) {
        Object[] objectArray;
        object = (Integer[])object;
        int n3 = this.b;
        Object object2 = this.a;
        {
            catch (SVGParseException sVGParseException) {
                object = n3;
                String string2 = ((Throwable)sVGParseException).getMessage();
                objectArray = new Object[2];
                objectArray[0] = object;
                n3 = 1;
                objectArray[n3] = string2;
                object = "Error loading resource 0x%x: %s";
                String.format((String)object, objectArray);
                return null;
            }
        }
        object2 = object2.getResources();
        objectArray = new uR2();
        object2 = object2.openRawResource(n3);
        try {
            objectArray = objectArray.f((InputStream)object2);
        }
        catch (Throwable throwable) {
            try {
                ((InputStream)object2).close();
            }
            catch (IOException iOException) {
                throw throwable;
            }
            throw throwable;
        }
        try {
            ((InputStream)object2).close();
            return objectArray;
        }
        catch (IOException iOException) {
            return objectArray;
        }
    }

    public final void onPostExecute(Object object) {
        object = (rR2)object;
        SVGImageView sVGImageView = this.c;
        sVGImageView.a = object;
        sVGImageView.a();
    }
}

