/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.SparseIntArray
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

/*
 * Renamed from pB3
 */
public final class pb3_1
extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public pb3_1(Parcel parcel) {
        int n3 = parcel.dataPosition();
        int n4 = parcel.dataSize();
        Jp jp = new Jp();
        Jp jp2 = new Jp();
        Jp jp4 = new Jp();
        this(parcel, n3, n4, "", jp, jp2, jp4);
    }

    public pb3_1(Parcel parcel, int n3, int n4, String string2, Jp jp, Jp jp2, Jp jp4) {
        super(jp, jp2, jp4);
        int n7;
        super();
        this.d = jp;
        this.i = n7 = -1;
        this.k = n7;
        this.e = parcel;
        this.f = n3;
        this.g = n4;
        this.j = n3;
        this.h = string2;
    }

    public final pb3_1 a() {
        pb3_1 pb3_12;
        Parcel parcel = this.e;
        int n3 = parcel.dataPosition();
        int n4 = this.j;
        int n7 = this.f;
        if (n4 == n7) {
            n4 = this.g;
        }
        n7 = n4;
        Object object = new StringBuilder();
        String string2 = this.h;
        string2 = h30_0.a((StringBuilder)object, string2, "  ");
        Jp jp = this.c;
        Jp jp2 = this.a;
        Jp jp4 = this.b;
        object = pb3_12;
        pb3_12 = new pb3_1(parcel, n3, n4, string2, jp2, jp4, jp);
        return pb3_12;
    }

    public final boolean e() {
        Parcel parcel = this.e;
        int n3 = parcel.readInt();
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            parcel = null;
        }
        return n3 != 0;
    }

    public final byte[] f() {
        Parcel parcel = this.e;
        int n3 = parcel.readInt();
        if (n3 < 0) {
            return null;
        }
        byte[] byArray = new byte[n3];
        parcel.readByteArray(byArray);
        return byArray;
    }

    public final CharSequence g() {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        Parcel parcel = this.e;
        return (CharSequence)creator.createFromParcel(parcel);
    }

    public final boolean h(int n3) {
        boolean bl2;
        int n4;
        while (true) {
            String string2;
            n4 = this.j;
            int n7 = this.g;
            bl2 = false;
            boolean bl3 = true;
            if (n4 >= n7) break;
            n4 = this.k;
            if (n4 == n3) {
                return bl3;
            }
            String string3 = String.valueOf(n4);
            if ((n4 = string3.compareTo(string2 = String.valueOf(n3))) > 0) {
                return false;
            }
            n4 = this.j;
            string2 = this.e;
            string2.setDataPosition(n4);
            n4 = string2.readInt();
            this.k = n7 = string2.readInt();
            this.j = n7 = this.j + n4;
        }
        n4 = this.k;
        if (n4 == n3) {
            bl2 = true;
        }
        return bl2;
    }

    public final int i() {
        return this.e.readInt();
    }

    public final Parcelable k() {
        ClassLoader classLoader = pb3_1.class.getClassLoader();
        return this.e.readParcelable(classLoader);
    }

    public final String l() {
        return this.e.readString();
    }

    public final void n(int n3) {
        this.w();
        this.i = n3;
        SparseIntArray sparseIntArray = this.d;
        int n4 = this.e.dataPosition();
        sparseIntArray.put(n3, n4);
        this.r(0);
        this.r(n3);
    }

    public final void o(boolean bl2) {
        this.e.writeInt((int)(bl2 ? 1 : 0));
    }

    public final void p(byte[] byArray) {
        Parcel parcel = this.e;
        if (byArray != null) {
            int n3 = byArray.length;
            parcel.writeInt(n3);
            parcel.writeByteArray(byArray);
        } else {
            int n4 = -1;
            parcel.writeInt(n4);
        }
    }

    public final void q(CharSequence charSequence) {
        Parcel parcel = this.e;
        TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)parcel, (int)0);
    }

    public final void r(int n3) {
        this.e.writeInt(n3);
    }

    public final void t(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    public final void u(String string2) {
        this.e.writeString(string2);
    }

    public final void w() {
        int n3 = this.i;
        if (n3 >= 0) {
            n3 = this.d.get(n3);
            Parcel parcel = this.e;
            int n4 = parcel.dataPosition();
            int n7 = n4 - n3;
            parcel.setDataPosition(n3);
            parcel.writeInt(n7);
            parcel.setDataPosition(n4);
        }
    }
}

