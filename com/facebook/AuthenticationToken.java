/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationToken$a;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenHeader;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class AuthenticationToken
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final AuthenticationTokenHeader c;
    public final AuthenticationTokenClaims d;
    public final String e;

    static {
        AuthenticationToken$a authenticationToken$a = new Object();
        CREATOR = authenticationToken$a;
    }

    public AuthenticationToken(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        Object object2 = object.readString();
        Xz3.g((String)object2, "token");
        this.a = object2;
        object2 = object.readString();
        Xz3.g((String)object2, "expectedNonce");
        this.b = object2;
        object2 = AuthenticationTokenHeader.class.getClassLoader();
        object2 = object.readParcelable((ClassLoader)object2);
        String string2 = "Required value was null.";
        if (object2 != null) {
            this.c = object2 = (AuthenticationTokenHeader)object2;
            object2 = AuthenticationTokenClaims.class.getClassLoader();
            if ((object2 = object.readParcelable((ClassLoader)object2)) != null) {
                this.d = object2 = (AuthenticationTokenClaims)object2;
                object = object.readString();
                Xz3.g((String)object, "signature");
                this.e = object;
                return;
            }
            object2 = string2.toString();
            super((String)object2);
            throw object;
        }
        object2 = string2.toString();
        super((String)object2);
        throw object;
    }

    public AuthenticationToken(String object, String charSequence) {
        Object object2 = "token";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "expectedNonce";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        Xz3.d((String)object, (String)object2);
        Xz3.d((String)charSequence, string2);
        object2 = new String[]{"."};
        boolean bl2 = false;
        string2 = null;
        object2 = StringsKt.a0((CharSequence)object, (String[])object2, false, 0, 6);
        int c2 = object2.size();
        int n3 = 3;
        if (c2 == n3) {
            block11: {
                AuthenticationTokenClaims authenticationTokenClaims;
                String string3 = (String)object2.get(0);
                n3 = 1;
                String string4 = (String)object2.get(n3);
                int n4 = 2;
                object2 = (String)object2.get(n4);
                this.a = object;
                this.b = charSequence;
                this.c = object = new AuthenticationTokenHeader(string3);
                this.d = authenticationTokenClaims = new AuthenticationTokenClaims(string4, (String)charSequence);
                object = ((AuthenticationTokenHeader)object).c;
                object = s72.b((String)object);
                if (object == null) break block11;
                object = s72.a((String)object);
                ((StringBuilder)charSequence).append(string3);
                char c3 = '.';
                ((StringBuilder)charSequence).append(c3);
                ((StringBuilder)charSequence).append(string4);
                charSequence = ((StringBuilder)charSequence).toString();
                try {
                    bl2 = s72.c((PublicKey)object, (String)charSequence, (String)object2);
                }
                catch (IOException | InvalidKeySpecException exception) {}
            }
            if (bl2) {
                this.e = object2;
                return;
            }
            charSequence = "Invalid Signature".toString();
            object = new IllegalArgumentException((String)charSequence);
            throw object;
        }
        charSequence = "Invalid IdToken string".toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.a;
        jSONObject.put("token_string", (Object)string2);
        string2 = this.b;
        jSONObject.put("expected_nonce", (Object)string2);
        Object object = this.c;
        object.getClass();
        string2 = new JSONObject();
        String string3 = ((AuthenticationTokenHeader)object).a;
        string2.put("alg", (Object)string3);
        string3 = ((AuthenticationTokenHeader)object).b;
        string2.put("typ", (Object)string3);
        object = ((AuthenticationTokenHeader)object).c;
        string2.put("kid", object);
        jSONObject.put("header", (Object)string2);
        object = this.d.a();
        jSONObject.put("claims", object);
        string2 = this.e;
        jSONObject.put("signature", (Object)string2);
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof AuthenticationToken;
        if (!bl4) {
            return false;
        }
        object = (AuthenticationToken)object;
        Object object2 = this.a;
        Object object3 = ((AuthenticationToken)object).a;
        bl4 = Intrinsics.areEqual(object2, object3);
        if (!(bl4 && (bl4 = Intrinsics.areEqual(object3 = this.b, object2 = ((AuthenticationToken)object).b)) && (bl4 = Intrinsics.areEqual(object3 = this.c, object2 = ((AuthenticationToken)object).c)) && (bl4 = Intrinsics.areEqual(object3 = this.d, object2 = ((AuthenticationToken)object).d)) && (bl2 = Intrinsics.areEqual(object3 = this.e, object = ((AuthenticationToken)object).e)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = 31;
        int n4 = zy_2.b(527, n3, string2);
        String string3 = this.b;
        n4 = zy_2.b(n4, n3, string3);
        int n7 = (this.c.hashCode() + n4) * 31;
        n4 = (this.d.hashCode() + n7) * 31;
        return this.e.hashCode() + n4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.d;
        parcel.writeParcelable((Parcelable)object, n3);
        String string2 = this.e;
        parcel.writeString(string2);
    }
}

