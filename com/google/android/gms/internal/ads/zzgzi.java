/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzh;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhar;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdj;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhep;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public abstract class zzgzi
implements zzhde {
    protected int zzq = 0;

    public static void zzaQ(Iterable iterable, List list) {
        zzgzh.zzbd(iterable, list);
    }

    public static void zzaR(zzhac serializable) {
        boolean bl2 = serializable.zzp();
        if (bl2) {
            return;
        }
        serializable = new IllegalArgumentException("Byte string is not UTF-8.");
        throw serializable;
    }

    private String zzdI(String string2) {
        String string3 = this.getClass().getName();
        return uc0_0.a("Serializing ", string3, " to a ", string2, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int zzaM(zzhdz zzhdz2) {
        return this.zzaL();
    }

    public zzhac zzaN() {
        Object object;
        String string2;
        int n3;
        try {
            n3 = this.zzaY();
        }
        catch (IOException iOException) {
            string2 = this.zzdI("ByteString");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        object = zzhac.zzb;
        object = new byte[n3];
        string2 = null;
        Object object2 = zzhat.zzF((byte[])object, 0, n3);
        this.zzda((zzhat)object2);
        ((zzhat)object2).zzG();
        object2 = new zzgzy((byte[])object);
        return object2;
    }

    public zzhdj zzaO() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("mutableCopy() is not implemented.");
        throw unsupportedOperationException;
    }

    public zzhep zzaP() {
        zzhep zzhep2 = new zzhep(this);
        return zzhep2;
    }

    public void zzaS(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void zzaT(OutputStream outputStream) {
        int n3 = this.zzaY();
        int n4 = zzhat.zzD(n3) + n3;
        n4 = zzhat.zzB(n4);
        zzhar zzhar2 = new zzhar(outputStream, n4);
        zzhar2.zzu(n3);
        this.zzda(zzhar2);
        zzhar2.zzL();
    }

    public void zzaU(OutputStream outputStream) {
        int n3 = zzhat.zzB(this.zzaY());
        zzhar zzhar2 = new zzhar(outputStream, n3);
        this.zzda(zzhar2);
        zzhar2.zzL();
    }

    public byte[] zzaV() {
        Object object;
        String string2;
        int n3;
        try {
            n3 = this.zzaY();
        }
        catch (IOException iOException) {
            string2 = this.zzdI("byte array");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        object = new byte[n3];
        string2 = null;
        zzhat zzhat2 = zzhat.zzF((byte[])object, 0, n3);
        this.zzda(zzhat2);
        zzhat2.zzG();
        return object;
    }
}

