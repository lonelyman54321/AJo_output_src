/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.caverock.androidsvg;

import android.os.AsyncTask;
import com.caverock.androidsvg.SVGImageView;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;

public final class SVGImageView$b
extends AsyncTask {
    public final /* synthetic */ SVGImageView a;

    public SVGImageView$b(SVGImageView sVGImageView) {
        this.a = sVGImageView;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object doInBackground(Object[] object) {
        Throwable throwable222;
        object = (InputStream[])object;
        Object object2 = object[0];
        uR2 uR22 = new uR2();
        object2 = uR22.f((InputStream)object2);
        try {
            object = object[0];
            ((InputStream)object).close();
            return object2;
        }
        catch (IOException iOException) {
            return object2;
        }
        {
            block10: {
                catch (Throwable throwable222) {
                    break block10;
                }
                catch (SVGParseException sVGParseException) {}
                {
                    ((Throwable)sVGParseException).getMessage();
                }
                object = object[0];
                ((InputStream)object).close();
                return null;
            }
            object = object[0];
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        {
            throw throwable222;
            catch (IOException iOException) {}
            return null;
        }
    }

    public final void onPostExecute(Object object) {
        object = (rR2)object;
        SVGImageView sVGImageView = this.a;
        sVGImageView.a = object;
        sVGImageView.a();
    }
}

