/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError$a;
import com.facebook.FacebookRequestError$c;
import com.facebook.FacebookServiceException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookRequestError
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final FacebookRequestError$c j;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Object g;
    public final String h;
    public final FacebookException i;

    static {
        Object object = new Object();
        j = object;
        object = new Object();
        CREATOR = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public FacebookRequestError(int var1_1, int var2_2, int var3_3, String var4_4, String var5_5, String var6_6, String var7_7, Object var8_8, FacebookException var9_9, boolean var10_10) {
        block4: {
            block7: {
                block6: {
                    block5: {
                        block3: {
                            super();
                            this.a = var1_1 /* !! */ ;
                            this.b = var2_2;
                            this.c = var3_3;
                            this.d = var4_4;
                            this.e = var6_6;
                            this.f = var7_7;
                            this.g = var8_8;
                            this.h = var5_5;
                            var11_11 = FacebookRequestError.j;
                            if (var9_9 == null) break block3;
                            this.i = var9_9;
                            var12_12 = FacebookRequestError$a.OTHER;
                            break block4;
                        }
                        var5_5 = this.a();
                        this.i = var4_4 = new FacebookServiceException(this, (String)var5_5);
                        var4_4 = var11_11.a();
                        if (!var10_10) break block5;
                        var4_4.getClass();
                        var12_12 = FacebookRequestError$a.TRANSIENT;
                        break block4;
                    }
                    var5_5 = var4_4.a;
                    if (var5_5 == null || !(var13_13 = var5_5.containsKey(var6_6 = Integer.valueOf(var2_2))) || (var5_5 = (Set)var5_5.get(var6_6 = Integer.valueOf(var2_2))) != null && !(var14_14 = var5_5.contains(var6_6 = Integer.valueOf(var3_3)))) break block6;
                    var12_12 = FacebookRequestError$a.OTHER;
                    break block4;
                }
                var5_5 = var4_4.c;
                if (var5_5 == null || !(var13_13 = var5_5.containsKey(var6_6 = Integer.valueOf(var2_2))) || (var5_5 = (Set)var5_5.get(var6_6 = Integer.valueOf(var2_2))) != null && !(var14_14 = var5_5.contains(var6_6 = Integer.valueOf(var3_3)))) break block7;
                var12_12 = FacebookRequestError$a.LOGIN_RECOVERABLE;
                break block4;
            }
            var4_4 = var4_4.b;
            if (var4_4 == null || !(var14_14 = var4_4.containsKey(var5_5 = Integer.valueOf(var2_2)))) ** GOTO lbl-1000
            var12_12 = var2_2;
            if ((var12_12 = (Set)var4_4.get(var12_12)) == null || (var2_2 = (int)var12_12.contains(var15_15 = Integer.valueOf(var3_3))) != 0) {
                var12_12 = FacebookRequestError$a.TRANSIENT;
            } else lbl-1000:
            // 2 sources

            {
                var12_12 = FacebookRequestError$a.OTHER;
            }
        }
        var11_11 = var11_11.a();
        var11_11.getClass();
        if (var12_12 != null) {
            var11_11 = sI0$b.$EnumSwitchMapping$0;
            var2_2 = var12_12.ordinal();
            var1_1 /* !! */  = (int)var11_11[var2_2];
        }
    }

    public FacebookRequestError(int n3, String string2, String string3) {
        this(-1, n3, -1, string2, string3, null, null, null, null, false);
    }

    public FacebookRequestError(Exception exception) {
        Exception exception2;
        boolean bl2 = exception instanceof FacebookException;
        if (bl2) {
            exception2 = exception = (FacebookException)exception;
        } else {
            FacebookException facebookException;
            super(exception);
            exception2 = facebookException;
        }
        this(-1, -1, -1, null, null, null, null, null, (FacebookException)exception2, false);
    }

    public final String a() {
        Object object = this.h;
        if (object == null) {
            object = this.i;
            object = object != null ? ((Throwable)object).getLocalizedMessage() : null;
        }
        return object;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("{HttpStatus: ");
        int n3 = this.a;
        charSequence.append(n3);
        charSequence.append(", errorCode: ");
        n3 = this.b;
        charSequence.append(n3);
        charSequence.append(", subErrorCode: ");
        n3 = this.c;
        charSequence.append(n3);
        charSequence.append(", errorType: ");
        String string2 = this.d;
        charSequence.append(string2);
        charSequence.append(", errorMessage: ");
        string2 = this.a();
        charSequence.append(string2);
        charSequence.append("}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder(\"{HttpStat\u2026(\"}\")\n        .toString()");
        return charSequence;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = this.c;
        parcel.writeInt(n3);
        String string2 = this.d;
        parcel.writeString(string2);
        string2 = this.a();
        parcel.writeString(string2);
        string2 = this.e;
        parcel.writeString(string2);
        string2 = this.f;
        parcel.writeString(string2);
    }
}

