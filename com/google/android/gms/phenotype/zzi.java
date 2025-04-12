/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 */
package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.phenotype.zzj;
import com.google.android.gms.phenotype.zzk;
import com.google.android.gms.phenotype.zzn;
import java.util.Arrays;
import java.util.Comparator;

public final class zzi
extends AbstractSafeParcelable
implements Comparable {
    public static final Parcelable.Creator CREATOR;
    private static final Comparator zzai;
    public final String name;
    private final long zzab;
    private final boolean zzac;
    private final double zzad;
    private final String zzae;
    private final byte[] zzaf;
    private final int zzag;
    public final int zzah;

    static {
        Object object = new zzk();
        CREATOR = object;
        zzai = object = new zzj();
    }

    public zzi(String string2, long l2, boolean bl2, double d2, String string3, byte[] byArray, int n3, int n4) {
        this.name = string2;
        this.zzab = l2;
        this.zzac = bl2;
        this.zzad = d2;
        this.zzae = string3;
        this.zzaf = byArray;
        this.zzag = n3;
        this.zzah = n4;
    }

    private static int compare(int n3, int n4) {
        if (n3 < n4) {
            return -1;
        }
        if (n3 == n4) {
            return 0;
        }
        return 1;
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (zzi)object;
        Object object2 = this.name;
        Object object3 = ((zzi)object).name;
        Object object4 = ((String)object2).compareTo((String)object3);
        if (object4 != 0) {
            return object4;
        }
        object4 = this.zzag;
        Object object5 = ((zzi)object).zzag;
        if ((object4 = zzi.compare(object4, object5)) != 0) {
            return object4;
        }
        object4 = this.zzag;
        object5 = -1;
        int n3 = 0;
        int n4 = 1;
        if (object4 != n4) {
            int n7 = 2;
            if (object4 != n7) {
                n7 = 3;
                if (object4 != n7) {
                    n7 = 4;
                    if (object4 != n7) {
                        n7 = 5;
                        if (object4 == n7) {
                            object2 = this.zzaf;
                            byte[] byArray = ((zzi)object).zzaf;
                            if (object2 == byArray) {
                                return 0;
                            }
                            if (object2 == null) {
                                return object5;
                            }
                            if (byArray == null) {
                                return n4;
                            }
                            while (true) {
                                object2 = this.zzaf;
                                object4 = ((Object)object2).length;
                                object3 = ((zzi)object).zzaf;
                                object5 = ((Object)object3).length;
                                if (n3 >= (object4 = Math.min(object4, object5))) break;
                                object2 = this.zzaf;
                                object4 = object2[n3];
                                object3 = ((zzi)object).zzaf;
                                object5 = object3[n3];
                                if ((object4 -= object5) != 0) {
                                    return object4;
                                }
                                ++n3;
                            }
                            object4 = this.zzaf.length;
                            int n8 = ((zzi)object).zzaf.length;
                            return zzi.compare(object4, n8);
                        }
                        object4 = this.zzag;
                        object2 = tk3_2.a(31, object4, "Invalid enum value: ");
                        object = new AssertionError(object2);
                        throw object;
                    }
                    object2 = this.zzae;
                    object = ((zzi)object).zzae;
                    if (object2 == object) {
                        return 0;
                    }
                    if (object2 == null) {
                        return object5;
                    }
                    if (object == null) {
                        return n4;
                    }
                    return ((String)object2).compareTo((String)object);
                }
                double d2 = this.zzad;
                double d5 = ((zzi)object).zzad;
                return Double.compare(d2, d5);
            }
            object4 = this.zzac;
            int n10 = ((zzi)object).zzac;
            if (object4 == n10) {
                return 0;
            }
            if (object4 != 0) {
                return n4;
            }
            return object5;
        }
        long l2 = this.zzab;
        long l3 = ((zzi)object).zzab;
        long l4 = l2 - l3;
        Object object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object6 < 0) {
            return object5;
        }
        if (object6 == false) {
            return 0;
        }
        return n4;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof zzi;
        int n4 = 0;
        if (n3 != 0) {
            int n7;
            int n8;
            object = (zzi)object;
            Object object2 = this.name;
            String string2 = ((zzi)object).name;
            n3 = zzn.equals(object2, string2);
            if (n3 != 0 && (n3 = this.zzag) == (n8 = ((zzi)object).zzag) && (n8 = this.zzah) == (n7 = ((zzi)object).zzah)) {
                n8 = 1;
                if (n3 != n8) {
                    n7 = 2;
                    if (n3 != n7) {
                        n7 = 3;
                        if (n3 != n7) {
                            n4 = 4;
                            if (n3 != n4) {
                                n4 = 5;
                                if (n3 == n4) {
                                    object2 = this.zzaf;
                                    object = ((zzi)object).zzaf;
                                    return Arrays.equals((byte[])object2, (byte[])object);
                                }
                                n3 = this.zzag;
                                object2 = tk3_2.a(31, n3, "Invalid enum value: ");
                                object = new AssertionError(object2);
                                throw object;
                            }
                            object2 = this.zzae;
                            object = ((zzi)object).zzae;
                            return zzn.equals(object2, object);
                        }
                        double d2 = this.zzad;
                        double d5 = ((zzi)object).zzad;
                        double d7 = d2 - d5;
                        Object object3 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                        if (object3 == false) {
                            return n8 != 0;
                        }
                        return false;
                    }
                    n3 = (int)(this.zzac ? 1 : 0);
                    int n10 = ((zzi)object).zzac;
                    if (n3 == n10) {
                        return n8 != 0;
                    }
                    return false;
                }
                long l2 = this.zzab;
                long l3 = ((zzi)object).zzab;
                long l4 = l2 - l3;
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 == false) {
                    return n8 != 0;
                }
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        int n3;
        String string2;
        Object object;
        block5: {
            block6: {
                block7: {
                    block8: {
                        object = new StringBuilder("Flag(");
                        string2 = this.name;
                        ((StringBuilder)object).append(string2);
                        string2 = ", ";
                        ((StringBuilder)object).append(string2);
                        n3 = this.zzag;
                        int n4 = 1;
                        if (n3 == n4) break block6;
                        n4 = 2;
                        if (n3 == n4) break block7;
                        n4 = 3;
                        if (n3 == n4) break block8;
                        int n7 = 4;
                        CharSequence charSequence = "'";
                        if (n3 != n7) {
                            n7 = 5;
                            if (n3 != n7) {
                                String string3 = this.name;
                                n4 = this.zzag;
                                n7 = lE2.a(27, string3);
                                charSequence = new StringBuilder(n7);
                                ((StringBuilder)charSequence).append("Invalid type: ");
                                ((StringBuilder)charSequence).append(string3);
                                ((StringBuilder)charSequence).append(string2);
                                ((StringBuilder)charSequence).append(n4);
                                string2 = ((StringBuilder)charSequence).toString();
                                object = new AssertionError((Object)string2);
                                throw object;
                            }
                            byte[] byArray = this.zzaf;
                            if (byArray == null) {
                                String string4 = "null";
                                ((StringBuilder)object).append(string4);
                                break block5;
                            } else {
                                ((StringBuilder)object).append((String)charSequence);
                                String string5 = Base64.encodeToString((byte[])this.zzaf, (int)n4);
                                ((StringBuilder)object).append(string5);
                                ((StringBuilder)object).append((String)charSequence);
                            }
                            break block5;
                        } else {
                            ((StringBuilder)object).append((String)charSequence);
                            String string6 = this.zzae;
                            ((StringBuilder)object).append(string6);
                            ((StringBuilder)object).append((String)charSequence);
                        }
                        break block5;
                    }
                    double d2 = this.zzad;
                    ((StringBuilder)object).append(d2);
                    break block5;
                }
                n3 = (int)(this.zzac ? 1 : 0);
                ((StringBuilder)object).append(n3 != 0);
                break block5;
            }
            long l2 = this.zzab;
            ((StringBuilder)object).append(l2);
        }
        ((StringBuilder)object).append(string2);
        n3 = this.zzag;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(string2);
        return g30.a(this.zzah, ")", (StringBuilder)object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.name;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        long l2 = this.zzab;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        int n4 = this.zzac;
        SafeParcelWriter.writeBoolean(parcel, 4, n4 != 0);
        double d2 = this.zzad;
        SafeParcelWriter.writeDouble(parcel, 5, d2);
        Object object = this.zzae;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zzaf;
        SafeParcelWriter.writeByteArray(parcel, 7, (byte[])object, false);
        n4 = this.zzag;
        SafeParcelWriter.writeInt(parcel, 8, n4);
        n4 = this.zzah;
        SafeParcelWriter.writeInt(parcel, 9, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

