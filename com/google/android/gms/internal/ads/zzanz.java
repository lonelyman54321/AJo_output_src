/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgbc;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzanz
implements zzapn {
    private final List zza;

    public zzanz() {
        this(0);
    }

    public zzanz(int n3) {
        zzgbc zzgbc2 = zzgbc.zzm();
        this.zza = zzgbc2;
    }

    public zzanz(int n3, List list) {
        this.zza = list;
    }

    private final zzapd zzb(zzapm object) {
        object = this.zzd((zzapm)object);
        zzapd zzapd2 = new zzapd((List)object);
        return zzapd2;
    }

    private final zzapr zzc(zzapm object) {
        object = this.zzd((zzapm)object);
        zzapr zzapr2 = new zzapr((List)object);
        return zzapr2;
    }

    private final List zzd(zzapm arrayList) {
        int n3;
        arrayList = (ArrayList<Object>)((zzapm)((Object)arrayList)).zze;
        zzfu zzfu2 = new zzfu((byte[])arrayList);
        arrayList = this.zza;
        while ((n3 = zzfu2.zzb()) > 0) {
            n3 = zzfu2.zzm();
            int n4 = zzfu2.zzm();
            int n7 = zzfu2.zzd() + n4;
            n4 = 134;
            if (n3 == n4) {
                arrayList = new ArrayList<Object>();
                n3 = zzfu2.zzm() & 0x1F;
                n4 = 0;
                for (int i3 = 0; i3 < n3; ++i3) {
                    String string2;
                    Object object;
                    int n8 = 3;
                    Charset charset = zzfxs.zzc;
                    Object object2 = zzfu2.zzA(n8, charset);
                    int n10 = zzfu2.zzm();
                    int n14 = n10 & 0x80;
                    int n15 = 1;
                    if (n14 != 0) {
                        n14 = 1;
                    } else {
                        n14 = 0;
                        object = null;
                    }
                    if (n14 != 0) {
                        n10 &= 0x3F;
                        string2 = "application/cea-708";
                    } else {
                        string2 = "application/cea-608";
                        n10 = 1;
                    }
                    byte by2 = (byte)zzfu2.zzm();
                    zzfu2.zzL(n15);
                    if (n14 != 0) {
                        n14 = by2 & 0x40;
                        if (n14 != 0) {
                            object = new byte[n15];
                            object[0] = n15;
                        } else {
                            object = new byte[n15];
                            object[0] = 0;
                        }
                        object = Collections.singletonList(object);
                    } else {
                        n14 = 0;
                        object = null;
                    }
                    zzal zzal2 = new zzal();
                    zzal2.zzX(string2);
                    zzal2.zzO((String)object2);
                    zzal2.zzw(n10);
                    zzal2.zzL((List)object);
                    object2 = zzal2.zzad();
                    arrayList.add(object2);
                }
            }
            zzfu2.zzK(n7);
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    public final zzapp zza(int var1_1, zzapm var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

