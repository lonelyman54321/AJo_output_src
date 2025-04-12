/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.icy.IcyHeaders$a;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class IcyHeaders
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    static {
        IcyHeaders$a icyHeaders$a = new Object();
        CREATOR = icyHeaders$a;
    }

    public IcyHeaders(int n3, String string2, String string3, String string4, boolean bl2, int n4) {
        int n7 = -1;
        n7 = n4 != n7 && n4 <= 0 ? 0 : 1;
        ct3.a(n7 != 0);
        this.a = n3;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = bl2;
        this.f = n4;
    }

    public IcyHeaders(Parcel parcel) {
        int n3;
        String string2;
        int n4;
        this.a = n4 = parcel.readInt();
        this.b = string2 = parcel.readString();
        this.c = string2 = parcel.readString();
        this.d = string2 = parcel.readString();
        n4 = gz3.a;
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        this.e = n4;
        this.f = n3 = parcel.readInt();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static IcyHeaders a(Map var0) {
        block32: {
            block29: {
                block33: {
                    block28: {
                        block27: {
                            var1_1 = "Invalid metadata interval: ";
                            var2_2 = "Invalid bitrate: ";
                            var3_3 = (List)var0.get("icy-br");
                            var4_4 = true;
                            var5_5 = 1.4E-45f;
                            var6_6 = -1;
                            if (var3_3 == null) break block33;
                            var3_3 = (String)var3_3.get(0);
                            try {
                                var7_7 = Integer.parseInt((String)var3_3) * 1000;
                                if (var7_7 <= 0) break block27;
                                var8_8 = true;
                                var9_9 = 1.4E-45f;
                                break block28;
                            }
                            catch (NumberFormatException v0) {
                                var7_7 = -1;
lbl17:
                                // 2 sources

                                while (true) {
                                    KW.b("Invalid bitrate header: ", (String)var3_3);
                                    var11_11 = var7_7;
                                    var8_8 = false;
                                    var9_9 = 0.0f;
                                    var2_2 = null;
                                    break block29;
                                    break;
                                }
                            }
                        }
                        var10_10 = new StringBuilder(var2_2);
                        var10_10.append((String)var3_3);
                        var2_2 = var10_10.toString();
                        try {
                            Cx.f(var2_2);
                            var8_8 = false;
                            var9_9 = 0.0f;
                            var2_2 = null;
                            var7_7 = -1;
                        }
                        catch (NumberFormatException v2) {
                            ** continue;
                        }
                    }
                    var11_11 = var7_7;
                    break block29;
                }
                var8_8 = false;
                var9_9 = 0.0f;
                var2_2 = null;
                var11_11 = -1;
            }
            var3_3 = (List)var0.get("icy-genre");
            var7_7 = 0;
            var12_12 = null;
            if (var3_3 != null) {
                var13_13 = var2_2 = (String)var3_3.get(0);
                var8_8 = true;
                var9_9 = 1.4E-45f;
            } else {
                var13_13 = null;
            }
            var3_3 = (List)var0.get("icy-name");
            if (var3_3 != null) {
                var14_14 = var2_2 = (String)var3_3.get(0);
                var8_8 = true;
                var9_9 = 1.4E-45f;
            } else {
                var14_14 = null;
            }
            var3_3 = (List)var0.get("icy-url");
            if (var3_3 != null) {
                var15_15 = var2_2 = (String)var3_3.get(0);
                var8_8 = true;
                var9_9 = 1.4E-45f;
            } else {
                var15_15 = null;
            }
            var3_3 = (List)var0.get("icy-pub");
            if (var3_3 != null) {
                var2_2 = (String)var3_3.get(0);
                var3_3 = "1";
                var16_16 = var2_2.equals(var3_3);
                var8_8 = true;
                var9_9 = 1.4E-45f;
            } else {
                var16_16 = false;
            }
            var3_3 = "icy-metaint";
            var0 = (List)var0.get(var3_3);
            if (var0 != null) {
                block31: {
                    block30: {
                        var0 = (String)var0.get(0);
                        var17_17 = Integer.parseInt((String)var0);
                        if (var17_17 <= 0) break block30;
                        var6_6 = var17_17;
                        break block31;
                    }
                    try {
                        var18_18 /* !! */  = new StringBuilder(var1_1);
                    }
                    catch (NumberFormatException v1) {
                        var6_6 = var17_17;
lbl92:
                        // 2 sources

                        while (true) {
                            KW.b(var1_1, (String)var0);
                            ** continue;
                            break;
                        }
                    }
                    var18_18 /* !! */ .append((String)var0);
                    var18_18 /* !! */  = var18_18 /* !! */ .toString();
                    Cx.f((String)var18_18 /* !! */ );
                    var4_4 = var8_8;
                    var5_5 = var9_9;
                }
                var8_8 = var4_4;
                var9_9 = var5_5;
lbl106:
                // 2 sources

                while (true) {
                    var19_19 = var6_6;
                    break block32;
                    break;
                }
            }
            var19_19 = -1;
        }
        if (var8_8) {
            var12_12 = var0;
            var0 = new IcyHeaders(var11_11, var13_13, var14_14, var15_15, var16_16, var19_19);
        }
        return var12_12;
        catch (NumberFormatException v3) {
            ** continue;
        }
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    int n3;
                    Object object2;
                    Object object3;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (object3 = IcyHeaders.class) != (object2 = object.getClass())) break block4;
                    object = (IcyHeaders)object;
                    int n4 = this.a;
                    int n7 = ((IcyHeaders)object).a;
                    if (n4 != n7) break block5;
                    n4 = gz3.a;
                    object2 = this.b;
                    object3 = ((IcyHeaders)object).b;
                    n4 = (int)(Objects.equals(object2, object3) ? 1 : 0);
                    if (n4 != 0 && (n4 = (int)(Objects.equals(object2 = this.c, object3 = ((IcyHeaders)object).c) ? 1 : 0)) != 0 && (n4 = (int)(Objects.equals(object2 = this.d, object3 = ((IcyHeaders)object).d) ? 1 : 0)) != 0 && (n4 = (int)(this.e ? 1 : 0)) == (n7 = (int)(((IcyHeaders)object).e ? 1 : 0)) && (n4 = this.f) == (n3 = ((IcyHeaders)object).f)) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a;
        int n7 = (527 + n4) * 31;
        n4 = 0;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n7 = (n7 + n3) * 31;
        string2 = this.c;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n7 = (n7 + n3) * 31;
        string2 = this.d;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n7 = (n7 + n4) * 31;
        n4 = (int)(this.e ? 1 : 0);
        n7 = (n7 + n4) * 31;
        n4 = this.f;
        return n7 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IcyHeaders: name=\"");
        String string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append("\", genre=\"");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append("\", bitrate=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", metadataInterval=");
        n3 = this.f;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void u(e$a e$a) {
        String string2 = this.c;
        if (string2 != null) {
            e$a.D = string2;
        }
        if ((string2 = this.b) != null) {
            e$a.B = string2;
        }
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
        String string2 = this.b;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
        string2 = this.d;
        parcel.writeString(string2);
        n3 = gz3.a;
        n3 = (int)(this.e ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.f;
        parcel.writeInt(n3);
    }
}

