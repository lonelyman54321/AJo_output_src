/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.LruCache
 */
package com.ril.ajio.customviews.widgets.managers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.LruCache;
import com.ril.ajio.R$styleable;

public class FontsManager {
    public static final int LORA_BOLD = 3;
    public static final int LORA_ITALIC = 2;
    private static final int LORA_REGULAR = 1;
    public static final int MULI_BOLD = 10;
    public static final int MULI_REGULAR = 9;
    public static final int SOURCESANS_PRO_BOLD = 7;
    private static final int SOURCESANS_PRO_ITALIC = 6;
    public static final int SOURCESANS_PRO_REGULAR = 5;
    public static final int SOURCESANS_PRO_SEMIBOLD = 8;
    private static volatile FontsManager instance;
    private LruCache sTypefaceCache;

    public FontsManager() {
        LruCache lruCache;
        this.sTypefaceCache = lruCache = new LruCache(17);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FontsManager getInstance() {
        Object object = instance;
        if (object != null) return instance;
        object = FontsManager.class;
        synchronized (object) {
            try {
                FontsManager fontsManager = instance;
                if (fontsManager != null) return instance;
                instance = fontsManager = new FontsManager();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public int getColor(Context context, int n3) {
        int n4;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 23;
        if (n7 >= n8) {
            n4 = t70.getColor(context, n3);
        } else {
            context = context.getResources();
            n4 = context.getColor(n3);
        }
        return n4;
    }

    public Typeface getTypeFace(Context context, AttributeSet attributeSet) {
        Resources.Theme theme = context.getTheme();
        int[] nArray = R$styleable.ajioFontTypeStylable;
        attributeSet = theme.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n3 = R$styleable.ajioEditTextStylable_fontFamily;
        n3 = attributeSet.getInt(n3, 0);
        context = this.getTypefaceWithFont(context, n3);
        attributeSet.recycle();
        return context;
    }

    /*
     * Exception decompiling
     */
    public Typeface getTypefaceWithFont(Context var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 45->48)] java.lang.Exception
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
}

