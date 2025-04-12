/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.widget.ImageView
 */
package com.ril.ajio.customviews.widgets.drawables;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

public class RecyclingBitmapDrawable
extends BitmapDrawable {
    static final String TAG = "CountingBitmapDrawable";
    private ImageView imageView;
    private int mCacheRefCount = 0;
    private Context mContext;
    private int mDisplayRefCount = 0;
    private boolean mHasBeenDisplayed;

    public RecyclingBitmapDrawable(Context context, Resources resources, Bitmap bitmap, ImageView imageView) {
        super(resources, bitmap);
        this.mContext = context;
        this.imageView = imageView;
    }

    /*
     * Exception decompiling
     */
    private void checkState() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [18 : 94->98)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean hasValidBitmap() {
        synchronized (this) {
            try {
                Bitmap bitmap = this.getBitmap();
                if (bitmap == null) return false;
                boolean bl2 = bitmap.isRecycled();
                if (bl2) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void setIsCached(boolean bl2) {
        // MONITORENTER : this
        if (bl2) {
            bl2 = this.mCacheRefCount + 1;
            this.mCacheRefCount = (int)(bl2 ? 1 : 0);
        } else {
            bl2 = this.mCacheRefCount + -1;
            this.mCacheRefCount = (int)(bl2 ? 1 : 0);
        }
        // MONITOREXIT : this
        this.checkState();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setIsDisplayed(boolean var1_1) {
        block5: {
            synchronized (this) {
                block6: {
                    var2_2 = 1;
                    if (!var1_1) break block6;
                    try {
                        var1_1 = this.mDisplayRefCount + var2_2;
                        this.mDisplayRefCount = (int)var1_1;
                        this.mHasBeenDisplayed = var2_2;
                        break block5;
                    }
                    catch (Throwable var3_3) {
                        ** break block7
                    }
                }
                var1_1 = this.mDisplayRefCount - var2_2;
                this.mDisplayRefCount = (int)var1_1;
            }
        }
        this.checkState();
        return;
lbl-1000:
        // 1 sources

        {
            throw var3_3;
        }
    }
}

