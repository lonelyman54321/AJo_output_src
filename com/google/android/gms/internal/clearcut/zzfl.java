/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfk;
import com.google.android.gms.internal.clearcut.zzfm;
import com.google.android.gms.internal.clearcut.zzfn;
import com.google.android.gms.internal.clearcut.zzfo;
import com.google.android.gms.internal.clearcut.zzfp;
import com.google.android.gms.internal.clearcut.zzfq;

public class zzfl
extends Enum {
    public static final /* enum */ zzfl zzqc;
    public static final /* enum */ zzfl zzqd;
    public static final /* enum */ zzfl zzqe;
    public static final /* enum */ zzfl zzqf;
    public static final /* enum */ zzfl zzqg;
    public static final /* enum */ zzfl zzqh;
    public static final /* enum */ zzfl zzqi;
    public static final /* enum */ zzfl zzqj;
    public static final /* enum */ zzfl zzqk;
    public static final /* enum */ zzfl zzql;
    public static final /* enum */ zzfl zzqm;
    public static final /* enum */ zzfl zzqn;
    public static final /* enum */ zzfl zzqo;
    public static final /* enum */ zzfl zzqp;
    public static final /* enum */ zzfl zzqq;
    public static final /* enum */ zzfl zzqr;
    public static final /* enum */ zzfl zzqs;
    public static final /* enum */ zzfl zzqt;
    private static final /* synthetic */ zzfl[] zzqw;
    private final zzfq zzqu;
    private final int zzqv;

    static {
        zzfl zzfl2;
        zzfl zzfl3;
        zzfl zzfl4;
        zzfl zzfl5;
        zzfl zzfl6;
        zzfl zzfl7;
        Enum enum_ = zzfq.zzra;
        int n3 = 1;
        zzqc = zzfl7 = new zzfl("DOUBLE", 0, (zzfq)enum_, n3);
        Enum enum_2 = zzfq.zzqz;
        int n4 = 5;
        zzqd = enum_ = new zzfl("FLOAT", n3, (zzfq)enum_2, n4);
        zzfl[] zzflArray = zzfq.zzqy;
        int n7 = 2;
        zzqe = enum_2 = new zzfl("INT64", n7, (zzfq)zzflArray, 0);
        int n8 = 3;
        zzqf = zzfl6 = new zzfl("UINT64", n8, (zzfq)zzflArray, 0);
        zzfq zzfq2 = zzfq.zzqx;
        zzqg = zzfl5 = new zzfl("INT32", 4, zzfq2, 0);
        zzqh = zzfl4 = new zzfl("FIXED64", n4, (zzfq)zzflArray, n3);
        zzqi = zzfl3 = new zzfl("FIXED32", 6, zzfq2, n4);
        Enum enum_3 = zzfq.zzrb;
        zzqj = zzfl2 = new zzfl("BOOL", 7, (zzfq)enum_3, 0);
        zzfq zzfq3 = zzfq.zzrc;
        zzqk = enum_3 = new zzfm(zzfq3, n7);
        zzfq3 = zzfq.zzrf;
        Enum enum_4 = new zzfn(zzfq3, n8);
        zzql = enum_4;
        zzfn zzfn2 = enum_4;
        int n10 = 2;
        zzfl zzfl8 = new zzfo(zzfq3, n10);
        zzqm = zzfl8;
        Enum enum_5 = zzfq.zzrd;
        zzfo zzfo2 = zzfl8;
        zzfl zzfl9 = new zzfp((zzfq)enum_5, n10);
        zzqn = zzfl9;
        enum_4 = new zzfl("UINT32", 12, zzfq2, 0);
        zzqo = enum_4;
        zzfl zzfl10 = enum_4;
        enum_4 = zzfq.zzre;
        zzfp zzfp2 = zzfl9;
        zzfl8 = new zzfl("ENUM", 13, (zzfq)enum_4, 0);
        zzqp = zzfl8;
        zzqq = enum_4 = new zzfl("SFIXED32", 14, zzfq2, 5);
        Enum enum_6 = enum_4;
        zzfl9 = new zzfl("SFIXED64", 15, (zzfq)zzflArray, 1);
        zzqr = zzfl9;
        zzqs = enum_4 = new zzfl("SINT32", 16, zzfq2, 0);
        int n14 = 17;
        zzqt = enum_5 = new zzfl("SINT64", n14, (zzfq)zzflArray, 0);
        zzflArray = new zzfl[18];
        zzflArray[0] = zzfl7;
        zzflArray[1] = enum_;
        zzflArray[2] = enum_2;
        zzflArray[3] = zzfl6;
        zzflArray[4] = zzfl5;
        zzflArray[5] = zzfl4;
        zzflArray[6] = zzfl3;
        zzflArray[7] = zzfl2;
        zzflArray[8] = enum_3;
        zzflArray[9] = zzfn2;
        zzflArray[10] = zzfo2;
        zzflArray[11] = zzfp2;
        zzflArray[12] = zzfl10;
        zzflArray[13] = zzfl8;
        zzflArray[14] = enum_6;
        zzflArray[15] = zzfl9;
        zzflArray[16] = enum_4;
        zzflArray[n14] = enum_5;
        zzqw = zzflArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzfl() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzqu = var3_2;
        this.zzqv = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ zzfl(zzfq zzfq2, int n3, zzfk zzfk2) {
        this((String)var1_-1, n3, (zzfq)((Object)zzfk2), (int)var4_3);
        void var4_3;
        void var1_-1;
    }

    public static zzfl[] values() {
        return (zzfl[])zzqw.clone();
    }

    public final zzfq zzek() {
        return this.zzqu;
    }

    public final int zzel() {
        return this.zzqv;
    }
}

