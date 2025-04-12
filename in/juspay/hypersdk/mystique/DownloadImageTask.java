/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.AsyncTask
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 */
package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.mystique.BitmapCache;
import java.lang.ref.WeakReference;

public class DownloadImageTask
extends AsyncTask {
    private static int downloadCount;
    private final BaseAdapter adapter;
    private final BitmapCache bitmapCache;
    private final WeakReference contextWeakReference;
    private final DuiCallback duiCallback;
    private String imageUrl;
    boolean isTriggerNotify;
    private final Integer palceHolder;

    public DownloadImageTask(BaseAdapter object, Integer n3, Context context, BitmapCache bitmapCache, DuiCallback duiCallback, ImageView imageView) {
        this.adapter = object;
        this.palceHolder = n3;
        super(context);
        this.contextWeakReference = object;
        this.bitmapCache = bitmapCache;
        this.duiCallback = duiCallback;
        int n4 = downloadCount;
        int n7 = 1;
        if (n4 == 0) {
            this.isTriggerNotify = n7;
        } else {
            context = null;
            this.isTriggerNotify = false;
        }
        downloadCount = (n4 + n7) % 5;
    }

    /*
     * Exception decompiling
     */
    private Bitmap getImage(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [17, 16 : 76->80)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Bitmap doInBackground(String ... object) {
        this.imageUrl = object = object[0];
        return this.getImage((String)object);
    }

    public void onPostExecute(Bitmap object) {
        super.onPostExecute(object);
        if (object != null) {
            Object object2 = this.bitmapCache;
            String string2 = this.imageUrl;
            ((BitmapCache)object2).put(string2, (Bitmap)object);
            object = this.adapter;
            if (object != null) {
                boolean bl2 = this.isTriggerNotify;
                if (bl2) {
                    object.notifyDataSetChanged();
                }
            } else {
                object = this.duiCallback.getLogger();
                object2 = "IMG_ERR";
                string2 = "Fetching image from url failed. Null adapter passed";
                object.e((String)object2, string2);
            }
        }
    }
}

