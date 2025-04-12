/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.plp;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.plp.PLPExtras$b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class PLPExtras
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean A;
    public RectF B;
    public final boolean C;
    public final boolean D;
    public String E;
    public final Bundle F;
    public Boolean G;
    public String H;
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final ArrayList r;
    public final Bundle s;
    public final String t;
    public final String u;
    public Integer v;
    public Uri w;
    public String x;
    public final Uri y;
    public final String z;

    static {
        PLPExtras$b pLPExtras$b = new Object();
        CREATOR = pLPExtras$b;
    }

    public PLPExtras() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, -1, 3);
    }

    public PLPExtras(Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, Boolean bl2, String string13, String string14, String string15, String string16, ArrayList arrayList, Bundle bundle, String string17, String string18, Integer n4, Uri uri, String string19, Uri uri2, String string20, boolean bl3, RectF rectF, boolean bl4, boolean bl5, String string21, Bundle bundle2, Boolean bl6, String string22) {
        Intrinsics.checkNotNullParameter(string22, "plpTheme");
        this.a = n3;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
        this.h = string8;
        this.i = string9;
        this.j = string10;
        this.k = string11;
        this.l = string12;
        this.m = bl2;
        this.n = string13;
        this.o = string14;
        this.p = string15;
        this.q = string16;
        this.r = arrayList;
        this.s = bundle;
        this.t = string17;
        this.u = string18;
        this.v = n4;
        this.w = uri;
        this.x = string19;
        this.y = uri2;
        this.z = string20;
        this.A = bl3;
        this.B = rectF;
        this.C = bl4;
        this.D = bl5;
        this.E = string21;
        this.F = bundle2;
        this.G = bl6;
        this.H = string22;
    }

    public /* synthetic */ PLPExtras(Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, Boolean bl2, String string13, String string14, ArrayList arrayList, Bundle bundle, String string15, String string16, Uri uri, String string17, Uri uri2, String string18, boolean bl3, boolean bl4, boolean bl5, String string19, Bundle bundle2, Boolean bl6, String string20, int n4, int n7) {
        String string21;
        String string22;
        Integer n8;
        Object object;
        int n10 = n4;
        int n14 = n4 & 1;
        int n15 = 0;
        if (n14 != 0) {
            object = 0;
            n8 = object;
        } else {
            n8 = n3;
        }
        n14 = n10 & 2;
        String string23 = n14 != 0 ? null : string2;
        n14 = n10 & 4;
        String string24 = n14 != 0 ? null : string3;
        n14 = n10 & 8;
        String string25 = n14 != 0 ? null : string4;
        n14 = n10 & 0x10;
        Object object2 = "";
        object = n14 != 0 ? object2 : string5;
        int n16 = n10 & 0x20;
        Object object3 = n16 != 0 ? object2 : string6;
        int n17 = n10 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string22 = null;
        } else {
            string22 = string7;
        }
        int n18 = n10 & 0x80;
        Object object4 = n18 != 0 ? object2 : string8;
        int n19 = n10 & 0x100;
        Object object5 = n19 != 0 ? object2 : string9;
        int n20 = n10 & 0x200;
        Object object6 = n20 != 0 ? object2 : string10;
        int n21 = n10 & 0x400;
        Object object7 = n21 != 0 ? object2 : string11;
        int n22 = n10 & 0x800;
        Object object8 = n22 != 0 ? object2 : string12;
        int n24 = n10 & 0x1000;
        Object object9 = n24 != 0 ? (object2 = Boolean.FALSE) : bl2;
        n24 = n10 & 0x2000;
        String string26 = n24 != 0 ? null : string13;
        n24 = n10 & 0x4000;
        String string27 = n24 != 0 ? null : string14;
        n24 = 0x20000 & n10;
        ArrayList arrayList2 = n24 != 0 ? null : arrayList;
        n24 = 0x40000 & n10;
        Bundle bundle3 = n24 != 0 ? null : bundle;
        n24 = 0x80000 & n10;
        String string28 = n24 != 0 ? null : string15;
        n24 = 0x100000 & n10;
        String string29 = n24 != 0 ? null : string16;
        n24 = 0x400000 & n10;
        Uri uri3 = n24 != 0 ? null : uri;
        n24 = 0x800000 & n10;
        String string30 = n24 != 0 ? null : string17;
        n24 = 0x1000000 & n10;
        Uri uri4 = n24 != 0 ? null : uri2;
        n24 = 0x2000000 & n10;
        String string31 = n24 != 0 ? null : string18;
        n24 = 0x4000000 & n10;
        boolean bl7 = n24 != 0 ? false : bl3;
        n24 = 0x10000000 & n10;
        boolean bl8 = n24 != 0 ? false : bl4;
        n24 = 0x20000000 & n10;
        boolean bl9 = n24 != 0 ? false : bl5;
        n15 = 0x40000000 & n10;
        String string32 = n15 != 0 ? null : string19;
        n15 = -1 << -1;
        Bundle bundle4 = (n10 &= n15) != 0 ? null : bundle2;
        n10 = n7 & 1;
        Boolean bl10 = n10 != 0 ? null : bl6;
        n10 = n7 & 2;
        String string33 = n10 != 0 ? (string21 = ld3_2.STORE_AJIO.getStoreId()) : string20;
        object2 = object;
        this(n8, string23, string24, string25, (String)object, (String)object3, string22, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, (Boolean)object9, string26, string27, null, null, arrayList2, bundle3, string28, string29, null, uri3, string30, uri4, string31, bl7, null, bl8, bl9, string32, bundle4, bl10, string33);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PLPExtras;
        if (!bl3) {
            return false;
        }
        object = (PLPExtras)object;
        Object object2 = this.a;
        Object object3 = ((PLPExtras)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((PLPExtras)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((PLPExtras)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((PLPExtras)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((PLPExtras)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((PLPExtras)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object2 = ((PLPExtras)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object2 = ((PLPExtras)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.i;
        object2 = ((PLPExtras)object).i;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.j;
        object2 = ((PLPExtras)object).j;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.k;
        object2 = ((PLPExtras)object).k;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.l;
        object2 = ((PLPExtras)object).l;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.m;
        object2 = ((PLPExtras)object).m;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.n;
        object2 = ((PLPExtras)object).n;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.o;
        object2 = ((PLPExtras)object).o;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.p;
        object2 = ((PLPExtras)object).p;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.q;
        object2 = ((PLPExtras)object).q;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.r;
        object2 = ((PLPExtras)object).r;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.s;
        object2 = ((PLPExtras)object).s;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.t;
        object2 = ((PLPExtras)object).t;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.u;
        object2 = ((PLPExtras)object).u;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.v;
        object2 = ((PLPExtras)object).v;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.w;
        object2 = ((PLPExtras)object).w;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.x;
        object2 = ((PLPExtras)object).x;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.y;
        object2 = ((PLPExtras)object).y;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.z;
        object2 = ((PLPExtras)object).z;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.A;
        boolean bl4 = ((PLPExtras)object).A;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.B;
        object2 = ((PLPExtras)object).B;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.C;
        bl4 = ((PLPExtras)object).C;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.D;
        bl4 = ((PLPExtras)object).D;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.E;
        object2 = ((PLPExtras)object).E;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.F;
        object2 = ((PLPExtras)object).F;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.G;
        object2 = ((PLPExtras)object).G;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.H;
        object = ((PLPExtras)object).H;
        boolean bl5 = Intrinsics.areEqual(object3, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Integer n8 = this.a;
        if (n8 == null) {
            n4 = 0;
            n8 = null;
        } else {
            n4 = ((Object)n8).hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.i;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.k;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.l;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.m;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.n;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.o;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.p;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.q;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.r;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.s;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.t;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.u;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.v;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.w;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.x;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.y;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.z;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = 1237;
        int n10 = this.A;
        n10 = n10 != 0 ? 1231 : 1237;
        n4 = (n4 + n10) * 31;
        RectF rectF = this.B;
        if (rectF == null) {
            n10 = 0;
            rectF = null;
        } else {
            n10 = rectF.hashCode();
        }
        n4 = (n4 + n10) * 31;
        n10 = (int)(this.C ? 1 : 0);
        n10 = n10 != 0 ? 1231 : 1237;
        n4 = (n4 + n10) * 31;
        n10 = (int)(this.D ? 1 : 0);
        if (n10 != 0) {
            n3 = 1231;
        }
        n4 = (n4 + n3) * 31;
        object = this.E;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.F;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.G;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        return this.H.hashCode() + n4;
    }

    public final String toString() {
        Object object = this.v;
        Uri uri = this.w;
        String string2 = this.x;
        RectF rectF = this.B;
        String string3 = this.E;
        Boolean bl2 = this.G;
        String string4 = this.H;
        StringBuilder stringBuilder = new StringBuilder("PLPExtras(tabType=");
        Object object2 = this.a;
        stringBuilder.append(object2);
        stringBuilder.append(", query=");
        object2 = this.b;
        stringBuilder.append((String)object2);
        stringBuilder.append(", search=");
        object2 = this.c;
        stringBuilder.append((String)object2);
        stringBuilder.append(", imageUrl=");
        object2 = this.d;
        stringBuilder.append((String)object2);
        stringBuilder.append(", storeId=");
        object2 = this.e;
        stringBuilder.append((String)object2);
        stringBuilder.append(", categoryId=");
        object2 = this.f;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchResult=");
        object2 = this.g;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchResultTerm=");
        object2 = this.h;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchItemName=");
        object2 = this.i;
        stringBuilder.append((String)object2);
        stringBuilder.append(", historySearchText=");
        object2 = this.j;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchType=");
        object2 = this.k;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchText=");
        object2 = this.l;
        stringBuilder.append((String)object2);
        stringBuilder.append(", didYouMean=");
        object2 = this.m;
        stringBuilder.append(object2);
        stringBuilder.append(", linkDetailUrl=");
        object2 = this.n;
        stringBuilder.append((String)object2);
        stringBuilder.append(", linkDetailQuery=");
        object2 = this.o;
        stringBuilder.append((String)object2);
        stringBuilder.append(", cmsNavigationUrl=");
        object2 = this.p;
        stringBuilder.append((String)object2);
        stringBuilder.append(", cmsNavigationQuery=");
        object2 = this.q;
        stringBuilder.append((String)object2);
        stringBuilder.append(", suggestionList=");
        object2 = this.r;
        stringBuilder.append(object2);
        stringBuilder.append(", notificationBundle=");
        object2 = this.s;
        stringBuilder.append(object2);
        stringBuilder.append(", pageType=");
        object2 = this.t;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchRedirected=");
        object2 = this.u;
        stringBuilder.append((String)object2);
        stringBuilder.append(", searchItemIndex=");
        stringBuilder.append(object);
        stringBuilder.append(", searchImageUri=");
        stringBuilder.append(uri);
        stringBuilder.append(", searchImageFilePath=");
        stringBuilder.append(string2);
        stringBuilder.append(", actualImageUri=");
        object = this.y;
        stringBuilder.append(object);
        stringBuilder.append(", actualImageFilePath=");
        object = this.z;
        stringBuilder.append((String)object);
        stringBuilder.append(", isFromGallery=");
        boolean bl3 = this.A;
        stringBuilder.append(bl3);
        stringBuilder.append(", croppedFrame=");
        stringBuilder.append(rectF);
        stringBuilder.append(", isFromImageSearch=");
        bl3 = this.C;
        stringBuilder.append(bl3);
        stringBuilder.append(", isFromVideoBanner=");
        bl3 = this.D;
        stringBuilder.append(bl3);
        stringBuilder.append(", searchQuery=");
        stringBuilder.append(string3);
        stringBuilder.append(", bundleData=");
        object = this.F;
        stringBuilder.append(object);
        stringBuilder.append(", isFromSearchTerm=");
        stringBuilder.append(bl2);
        stringBuilder.append(", plpTheme=");
        return h30_0.a(stringBuilder, string4, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        String string2 = "dest";
        Intrinsics.checkNotNullParameter(parcel, string2);
        int n7 = 1;
        Object object = this.a;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n4 = (Integer)object;
            parcel.writeInt(n4);
        }
        object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        object = this.d;
        parcel.writeString((String)object);
        object = this.e;
        parcel.writeString((String)object);
        object = this.f;
        parcel.writeString((String)object);
        object = this.g;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeString((String)object);
        object = this.i;
        parcel.writeString((String)object);
        object = this.j;
        parcel.writeString((String)object);
        object = this.k;
        parcel.writeString((String)object);
        object = this.l;
        parcel.writeString((String)object);
        object = this.m;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n7, (Boolean)object);
        }
        object = this.n;
        parcel.writeString((String)object);
        object = this.o;
        parcel.writeString((String)object);
        object = this.p;
        parcel.writeString((String)object);
        object = this.q;
        parcel.writeString((String)object);
        object = this.r;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            int n8 = ((ArrayList)object).size();
            parcel.writeInt(n8);
            object = ((ArrayList)object).iterator();
            while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Parcelable parcelable = (Parcelable)object.next();
                parcel.writeParcelable(parcelable, n3);
            }
        }
        object = this.s;
        parcel.writeBundle((Bundle)object);
        object = this.t;
        parcel.writeString((String)object);
        object = this.u;
        parcel.writeString((String)object);
        object = this.v;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n4 = (Integer)object;
            parcel.writeInt(n4);
        }
        object = this.w;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.x;
        parcel.writeString((String)object);
        object = this.y;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.z;
        parcel.writeString((String)object);
        n4 = (int)(this.A ? 1 : 0);
        parcel.writeInt(n4);
        object = this.B;
        parcel.writeParcelable((Parcelable)object, n3);
        n3 = (int)(this.C ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.D ? 1 : 0);
        parcel.writeInt(n3);
        Object object2 = this.E;
        parcel.writeString((String)object2);
        object2 = this.F;
        parcel.writeBundle((Bundle)object2);
        object2 = this.G;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n7, (Boolean)object2);
        }
        object2 = this.H;
        parcel.writeString((String)object2);
    }
}

