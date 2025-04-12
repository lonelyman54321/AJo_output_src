/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.Profile$a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class Profile
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri g;

    static {
        Profile$a profile$a = new Object();
        CREATOR = profile$a;
    }

    public Profile(Parcel object) {
        String string2;
        this.a = string2 = object.readString();
        this.b = string2 = object.readString();
        this.c = string2 = object.readString();
        this.d = string2 = object.readString();
        this.e = string2 = object.readString();
        string2 = object.readString();
        Uri uri = null;
        string2 = string2 == null ? null : Uri.parse((String)string2);
        this.f = string2;
        object = object.readString();
        if (object != null) {
            uri = Uri.parse((String)object);
        }
        this.g = uri;
    }

    public Profile(String string2, String string3, String string4, String string5, String string6, Uri uri, Uri uri2) {
        Xz3.g(string2, "id");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = uri;
        this.g = uri2;
    }

    public Profile(JSONObject object) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "jsonObject");
        Uri uri = null;
        this.a = string2 = object.optString("id", null);
        this.b = string2 = object.optString("first_name", null);
        this.c = string2 = object.optString("middle_name", null);
        this.d = string2 = object.optString("last_name", null);
        this.e = string2 = object.optString("name", null);
        string2 = object.optString("link_uri", null);
        string2 = string2 == null ? null : Uri.parse((String)string2);
        this.f = string2;
        string2 = "picture_uri";
        object = object.optString(string2, null);
        if (object != null) {
            uri = Uri.parse((String)object);
        }
        this.g = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block19: {
            block7: {
                boolean bl3;
                String string2;
                block18: {
                    Object object2;
                    block17: {
                        boolean bl4;
                        block16: {
                            block15: {
                                block14: {
                                    block13: {
                                        block12: {
                                            block11: {
                                                block10: {
                                                    block9: {
                                                        block8: {
                                                            block6: {
                                                                block5: {
                                                                    bl2 = true;
                                                                    if (this == object) {
                                                                        return bl2;
                                                                    }
                                                                    bl4 = object instanceof Profile;
                                                                    if (!bl4) {
                                                                        return false;
                                                                    }
                                                                    string2 = this.a;
                                                                    if (string2 != null) break block5;
                                                                    object2 = object;
                                                                    object2 = ((Profile)object).a;
                                                                    if (object2 == null) break block6;
                                                                }
                                                                object2 = object;
                                                                object2 = ((Profile)object).a;
                                                                bl4 = Intrinsics.areEqual(string2, object2);
                                                                if (!bl4) break block7;
                                                            }
                                                            if ((string2 = this.b) != null) break block8;
                                                            object2 = object;
                                                            object2 = ((Profile)object).b;
                                                            if (object2 == null) break block9;
                                                        }
                                                        object2 = object;
                                                        object2 = ((Profile)object).b;
                                                        bl4 = Intrinsics.areEqual(string2, object2);
                                                        if (!bl4) break block7;
                                                    }
                                                    if ((string2 = this.c) != null) break block10;
                                                    object2 = object;
                                                    object2 = ((Profile)object).c;
                                                    if (object2 == null) break block11;
                                                }
                                                object2 = object;
                                                object2 = ((Profile)object).c;
                                                bl4 = Intrinsics.areEqual(string2, object2);
                                                if (!bl4) break block7;
                                            }
                                            if ((string2 = this.d) != null) break block12;
                                            object2 = object;
                                            object2 = ((Profile)object).d;
                                            if (object2 == null) break block13;
                                        }
                                        object2 = object;
                                        object2 = ((Profile)object).d;
                                        bl4 = Intrinsics.areEqual(string2, object2);
                                        if (!bl4) break block7;
                                    }
                                    if ((string2 = this.e) != null) break block14;
                                    object2 = object;
                                    object2 = ((Profile)object).e;
                                    if (object2 == null) break block15;
                                }
                                object2 = object;
                                object2 = ((Profile)object).e;
                                bl4 = Intrinsics.areEqual(string2, object2);
                                if (!bl4) break block7;
                            }
                            if ((string2 = this.f) != null) break block16;
                            object2 = object;
                            object2 = ((Profile)object).f;
                            if (object2 == null) break block17;
                        }
                        object2 = object;
                        object2 = ((Profile)object).f;
                        bl4 = Intrinsics.areEqual(string2, object2);
                        if (!bl4) break block7;
                    }
                    if ((string2 = this.g) != null) break block18;
                    object2 = object;
                    object2 = ((Profile)object).g;
                    if (object2 == null) break block19;
                }
                if (bl3 = Intrinsics.areEqual(string2, object = ((Profile)object).g)) break block19;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        int n4 = 527 + n3;
        string2 = this.b;
        if (string2 != null) {
            n4 *= 31;
            n3 = string2.hashCode();
            n4 += n3;
        }
        if ((string2 = this.c) != null) {
            n4 *= 31;
            n3 = string2.hashCode();
            n4 += n3;
        }
        if ((string2 = this.d) != null) {
            n4 *= 31;
            n3 = string2.hashCode();
            n4 += n3;
        }
        if ((string2 = this.e) != null) {
            n4 *= 31;
            n3 = string2.hashCode();
            n4 += n3;
        }
        if ((string2 = this.f) != null) {
            n4 *= 31;
            n3 = string2.hashCode();
            n4 += n3;
        }
        if ((string2 = this.g) != null) {
            n4 *= 31;
            n3 = string2.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
        string2 = this.d;
        parcel.writeString(string2);
        string2 = this.e;
        parcel.writeString(string2);
        string2 = null;
        Object object = this.f;
        object = object != null ? object.toString() : null;
        parcel.writeString((String)object);
        object = this.g;
        if (object != null) {
            string2 = object.toString();
        }
        parcel.writeString(string2);
    }
}

