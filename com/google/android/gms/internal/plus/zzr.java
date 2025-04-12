/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.internal.plus.zzr$zza;
import com.google.android.gms.internal.plus.zzr$zzb;
import com.google.android.gms.internal.plus.zzr$zzc;
import com.google.android.gms.internal.plus.zzr$zzd;
import com.google.android.gms.internal.plus.zzr$zze;
import com.google.android.gms.internal.plus.zzr$zzf;
import com.google.android.gms.internal.plus.zzr$zzg;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person$AgeRange;
import com.google.android.gms.plus.model.people.Person$Cover;
import com.google.android.gms.plus.model.people.Person$Image;
import com.google.android.gms.plus.model.people.Person$Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzr
extends FastSafeParcelableJsonResponse
implements Person {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private final Set zzap;
    private String zzaq;
    private zzr$zza zzar;
    private String zzas;
    private String zzat;
    private int zzau;
    private zzr$zzb zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private String zzaz;
    private zzr$zzc zzba;
    private boolean zzbb;
    private String zzbc;
    private zzr$zzd zzbd;
    private String zzbe;
    private int zzbf;
    private List zzbg;
    private List zzbh;
    private int zzbi;
    private int zzbj;
    private String zzbk;
    private List zzbl;
    private boolean zzbm;
    private String zzk;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        Object object = "aboutMe";
        int n3 = 2;
        Object object2 = FastJsonResponse$Field.forString((String)object, n3);
        hashMap.put((String)object, (FastJsonResponse$Field)object2);
        object2 = "ageRange";
        int n4 = 3;
        object = FastJsonResponse$Field.forConcreteType((String)object2, n4, zzr$zza.class);
        hashMap.put((String)object2, (FastJsonResponse$Field)object);
        object = "birthday";
        int n7 = 4;
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forString((String)object, n7);
        hashMap.put((String)object, fastJsonResponse$Field);
        object = "braggingRights";
        int n8 = 5;
        FastJsonResponse$Field fastJsonResponse$Field2 = FastJsonResponse$Field.forString((String)object, n8);
        hashMap.put((String)object, fastJsonResponse$Field2);
        object = "circledByCount";
        int n10 = 6;
        Object object3 = FastJsonResponse$Field.forInteger((String)object, n10);
        hashMap.put((String)object, (FastJsonResponse$Field)object3);
        object3 = "cover";
        int n14 = 7;
        object = FastJsonResponse$Field.forConcreteType((String)object3, n14, zzr$zzb.class);
        hashMap.put((String)object3, (FastJsonResponse$Field)object);
        object = "currentLocation";
        int n15 = 8;
        Object object4 = FastJsonResponse$Field.forString((String)object, n15);
        hashMap.put((String)object, (FastJsonResponse$Field)object4);
        object4 = "displayName";
        object = FastJsonResponse$Field.forString((String)object4, 9);
        hashMap.put((String)object4, (FastJsonResponse$Field)object);
        object = new StringToIntConverter();
        object = ((StringToIntConverter)object).add("male", 0);
        int n16 = 1;
        object = ((StringToIntConverter)object).add("female", n16).add("other", n3);
        object4 = "gender";
        object = FastJsonResponse$Field.withConverter((String)object4, 12, (FastJsonResponse$FieldConverter)object, false);
        hashMap.put((String)object4, (FastJsonResponse$Field)object);
        object4 = "id";
        object = FastJsonResponse$Field.forString((String)object4, 14);
        hashMap.put((String)object4, (FastJsonResponse$Field)object);
        String string2 = "image";
        object = FastJsonResponse$Field.forConcreteType(string2, 15, zzr$zzc.class);
        hashMap.put(string2, (FastJsonResponse$Field)object);
        object4 = "isPlusUser";
        object = FastJsonResponse$Field.forBoolean((String)object4, 16);
        hashMap.put((String)object4, (FastJsonResponse$Field)object);
        object4 = "language";
        object = FastJsonResponse$Field.forString((String)object4, 18);
        hashMap.put((String)object4, (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forConcreteType("name", 19, zzr$zzd.class);
        hashMap.put("name", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forString("nickname", 20);
        hashMap.put("nickname", (FastJsonResponse$Field)object);
        object = new StringToIntConverter();
        object = ((StringToIntConverter)object).add("person", 0).add("page", n16);
        object = FastJsonResponse$Field.withConverter("objectType", 21, (FastJsonResponse$FieldConverter)object, false);
        hashMap.put("objectType", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forConcreteTypeArray("organizations", 22, zzr$zze.class);
        hashMap.put("organizations", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forConcreteTypeArray("placesLived", 23, zzr$zzf.class);
        hashMap.put("placesLived", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forInteger("plusOneCount", 24);
        hashMap.put("plusOneCount", (FastJsonResponse$Field)object);
        object = new StringToIntConverter();
        object = ((StringToIntConverter)object).add("single", 0).add("in_a_relationship", n16).add("engaged", n3).add("married", n4).add("its_complicated", n7).add("open_relationship", n8).add("widowed", n10).add("in_domestic_partnership", n14).add("in_civil_union", n15);
        object = FastJsonResponse$Field.withConverter("relationshipStatus", 25, (FastJsonResponse$FieldConverter)object, false);
        hashMap.put("relationshipStatus", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forString("tagline", 26);
        hashMap.put("tagline", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forString("url", 27);
        hashMap.put("url", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forConcreteTypeArray("urls", 28, zzr$zzg.class);
        hashMap.put("urls", (FastJsonResponse$Field)object);
        object = FastJsonResponse$Field.forBoolean("verified", 29);
        hashMap.put("verified", (FastJsonResponse$Field)object);
    }

    public zzr() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr(String object, String string2, zzr$zzc zzr$zzc, int n3, String string3) {
        HashSet<Object> hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet<Object>();
        this.zzax = object;
        object = 9;
        hashSet.add(object);
        this.zzaz = string2;
        object = 14;
        hashSet.add(object);
        this.zzba = zzr$zzc;
        object = 15;
        hashSet.add(object);
        this.zzbf = n3;
        object = 21;
        hashSet.add(object);
        this.zzk = string3;
        object = 27;
        hashSet.add(object);
    }

    public zzr(Set set, int n3, String string2, zzr$zza zzr$zza, String string3, String string4, int n4, zzr$zzb zzr$zzb, String string5, String string6, int n7, String string7, zzr$zzc zzr$zzc, boolean bl2, String string8, zzr$zzd zzr$zzd, String string9, int n8, List list, List list2, int n10, int n14, String string10, String string11, List list3, boolean bl3) {
        this.zzap = set;
        this.zzw = n3;
        this.zzaq = string2;
        this.zzar = zzr$zza;
        this.zzas = string3;
        this.zzat = string4;
        this.zzau = n4;
        this.zzav = zzr$zzb;
        this.zzaw = string5;
        this.zzax = string6;
        this.zzay = n7;
        this.zzaz = string7;
        this.zzba = zzr$zzc;
        this.zzbb = bl2;
        this.zzbc = string8;
        this.zzbd = zzr$zzd;
        this.zzbe = string9;
        this.zzbf = n8;
        this.zzbg = list;
        this.zzbh = list2;
        this.zzbi = n10;
        this.zzbj = n14;
        this.zzbk = string10;
        this.zzk = string11;
        this.zzbl = list3;
        this.zzbm = bl3;
    }

    public static zzr zza(byte[] object) {
        Parcel parcel = Parcel.obtain();
        int n3 = ((byte[])object).length;
        parcel.unmarshall(object, 0, n3);
        parcel.setDataPosition(0);
        object = (zzr)CREATOR.createFromParcel(parcel);
        parcel.recycle();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field object, String object2, ArrayList object3) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 22)) {
            n3 = 23;
            if (n4 != n3) {
                n3 = 28;
                if (n4 != n3) {
                    object3 = object3.getClass().getCanonicalName();
                    int n7 = lE2.a(71, (String)object3);
                    StringBuilder stringBuilder = new StringBuilder(n7);
                    stringBuilder.append("Field with id=");
                    stringBuilder.append(n4);
                    stringBuilder.append(" is not a known array of custom type.  Found ");
                    stringBuilder.append((String)object3);
                    stringBuilder.append(".");
                    object = stringBuilder.toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
                this.zzbl = object3;
            } else {
                this.zzbh = object3;
            }
        } else {
            this.zzbg = object3;
        }
        object2 = this.zzap;
        object = n4;
        object2.add(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void addConcreteTypeInternal(FastJsonResponse$Field object, String object2, FastJsonResponse object3) {
        int n3;
        block5: {
            block6: {
                int n4;
                n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                if (n3 == (n4 = 3)) break block6;
                n4 = 7;
                if (n3 != n4) {
                    n4 = 15;
                    if (n3 != n4) {
                        n4 = 19;
                        if (n3 != n4) {
                            object3 = object3.getClass().getCanonicalName();
                            int n7 = lE2.a(62, (String)object3);
                            StringBuilder stringBuilder = new StringBuilder(n7);
                            stringBuilder.append("Field with id=");
                            stringBuilder.append(n3);
                            stringBuilder.append(" is not a known custom type.  Found ");
                            stringBuilder.append((String)object3);
                            stringBuilder.append(".");
                            object = stringBuilder.toString();
                            object2 = new IllegalArgumentException((String)object);
                            throw object2;
                        }
                        this.zzbd = object3 = (zzr$zzd)object3;
                        break block5;
                    } else {
                        this.zzba = object3 = (zzr$zzc)object3;
                    }
                    break block5;
                } else {
                    this.zzav = object3 = (zzr$zzb)object3;
                }
                break block5;
            }
            this.zzar = object3 = (zzr$zza)object3;
        }
        object2 = this.zzap;
        object = n3;
        object2.add(object);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public final String getAboutMe() {
        return this.zzaq;
    }

    public final Person$AgeRange getAgeRange() {
        return this.zzar;
    }

    public final String getBirthday() {
        return this.zzas;
    }

    public final String getBraggingRights() {
        return this.zzat;
    }

    public final int getCircledByCount() {
        return this.zzau;
    }

    public final Person$Cover getCover() {
        return this.zzav;
    }

    public final String getCurrentLocation() {
        return this.zzaw;
    }

    public final String getDisplayName() {
        return this.zzax;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzao;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        switch (n3) {
            default: {
                int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                object = tk3_2.a(38, n4, "Unknown safe parcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            case 29: {
                return this.zzbm;
            }
            case 28: {
                return this.zzbl;
            }
            case 27: {
                return this.zzk;
            }
            case 26: {
                return this.zzbk;
            }
            case 25: {
                return this.zzbj;
            }
            case 24: {
                return this.zzbi;
            }
            case 23: {
                return this.zzbh;
            }
            case 22: {
                return this.zzbg;
            }
            case 21: {
                return this.zzbf;
            }
            case 20: {
                return this.zzbe;
            }
            case 19: {
                return this.zzbd;
            }
            case 18: {
                return this.zzbc;
            }
            case 16: {
                return this.zzbb;
            }
            case 15: {
                return this.zzba;
            }
            case 14: {
                return this.zzaz;
            }
            case 12: {
                return this.zzay;
            }
            case 9: {
                return this.zzax;
            }
            case 8: {
                return this.zzaw;
            }
            case 7: {
                return this.zzav;
            }
            case 6: {
                return this.zzau;
            }
            case 5: {
                return this.zzat;
            }
            case 4: {
                return this.zzas;
            }
            case 3: {
                return this.zzar;
            }
            case 2: 
        }
        return this.zzaq;
    }

    public final int getGender() {
        return this.zzay;
    }

    public final String getId() {
        return this.zzaz;
    }

    public final Person$Image getImage() {
        return this.zzba;
    }

    public final String getLanguage() {
        return this.zzbc;
    }

    public final Person$Name getName() {
        return this.zzbd;
    }

    public final String getNickname() {
        return this.zzbe;
    }

    public final int getObjectType() {
        return this.zzbf;
    }

    public final List getOrganizations() {
        return (ArrayList)this.zzbg;
    }

    public final List getPlacesLived() {
        return (ArrayList)this.zzbh;
    }

    public final int getPlusOneCount() {
        return this.zzbi;
    }

    public final int getRelationshipStatus() {
        return this.zzbj;
    }

    public final String getTagline() {
        return this.zzbk;
    }

    public final String getUrl() {
        return this.zzk;
    }

    public final List getUrls() {
        return (ArrayList)this.zzbl;
    }

    public final boolean hasAboutMe() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final boolean hasAgeRange() {
        Set set = this.zzap;
        Integer n3 = 3;
        return set.contains(n3);
    }

    public final boolean hasBirthday() {
        Set set = this.zzap;
        Integer n3 = 4;
        return set.contains(n3);
    }

    public final boolean hasBraggingRights() {
        Set set = this.zzap;
        Integer n3 = 5;
        return set.contains(n3);
    }

    public final boolean hasCircledByCount() {
        Set set = this.zzap;
        Integer n3 = 6;
        return set.contains(n3);
    }

    public final boolean hasCover() {
        Set set = this.zzap;
        Integer n3 = 7;
        return set.contains(n3);
    }

    public final boolean hasCurrentLocation() {
        Set set = this.zzap;
        Integer n3 = 8;
        return set.contains(n3);
    }

    public final boolean hasDisplayName() {
        Set set = this.zzap;
        Integer n3 = 9;
        return set.contains(n3);
    }

    public final boolean hasGender() {
        Set set = this.zzap;
        Integer n3 = 12;
        return set.contains(n3);
    }

    public final boolean hasId() {
        Set set = this.zzap;
        Integer n3 = 14;
        return set.contains(n3);
    }

    public final boolean hasImage() {
        Set set = this.zzap;
        Integer n3 = 15;
        return set.contains(n3);
    }

    public final boolean hasIsPlusUser() {
        Set set = this.zzap;
        Integer n3 = 16;
        return set.contains(n3);
    }

    public final boolean hasLanguage() {
        Set set = this.zzap;
        Integer n3 = 18;
        return set.contains(n3);
    }

    public final boolean hasName() {
        Set set = this.zzap;
        Integer n3 = 19;
        return set.contains(n3);
    }

    public final boolean hasNickname() {
        Set set = this.zzap;
        Integer n3 = 20;
        return set.contains(n3);
    }

    public final boolean hasObjectType() {
        Set set = this.zzap;
        Integer n3 = 21;
        return set.contains(n3);
    }

    public final boolean hasOrganizations() {
        Set set = this.zzap;
        Integer n3 = 22;
        return set.contains(n3);
    }

    public final boolean hasPlacesLived() {
        Set set = this.zzap;
        Integer n3 = 23;
        return set.contains(n3);
    }

    public final boolean hasPlusOneCount() {
        Set set = this.zzap;
        Integer n3 = 24;
        return set.contains(n3);
    }

    public final boolean hasRelationshipStatus() {
        Set set = this.zzap;
        Integer n3 = 25;
        return set.contains(n3);
    }

    public final boolean hasTagline() {
        Set set = this.zzap;
        Integer n3 = 26;
        return set.contains(n3);
    }

    public final boolean hasUrl() {
        Set set = this.zzap;
        Integer n3 = 27;
        return set.contains(n3);
    }

    public final boolean hasUrls() {
        Set set = this.zzap;
        Integer n3 = 28;
        return set.contains(n3);
    }

    public final boolean hasVerified() {
        Set set = this.zzap;
        Integer n3 = 29;
        return set.contains(n3);
    }

    public final int hashCode() {
        boolean bl2;
        Iterator iterator = zzao.values().iterator();
        int n3 = 0;
        Object object = null;
        while (bl2 = iterator.hasNext()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field)iterator.next();
            int n4 = this.isFieldSet(fastJsonResponse$Field);
            if (n4 == 0) continue;
            n4 = fastJsonResponse$Field.getSafeParcelableFieldId() + n3;
            object = this.getFieldValue(fastJsonResponse$Field);
            n3 = object.hashCode() + n4;
        }
        return n3;
    }

    public final boolean isDataValid() {
        return true;
    }

    public final boolean isFieldSet(FastJsonResponse$Field object) {
        Set set = this.zzap;
        object = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        return set.contains(object);
    }

    public final boolean isPlusUser() {
        return this.zzbb;
    }

    public final boolean isVerified() {
        return this.zzbm;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setBooleanInternal(FastJsonResponse$Field object, String object2, boolean bl2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 16)) {
            n3 = 29;
            if (n4 != n3) {
                object = oe2_0.a(55, n4, "Field with id=", " is not known to be a boolean.");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.zzbm = bl2;
        } else {
            this.zzbb = bl2;
        }
        object2 = this.zzap;
        object = n4;
        object2.add(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        block5: {
            block6: {
                block7: {
                    int n7;
                    n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                    if (n4 == (n7 = 6)) break block6;
                    n7 = 12;
                    if (n4 == n7) break block7;
                    n7 = 21;
                    if (n4 != n7) {
                        n7 = 24;
                        if (n4 != n7) {
                            n7 = 25;
                            if (n4 != n7) {
                                object = oe2_0.a(52, n4, "Field with id=", " is not known to be an int.");
                                object2 = new IllegalArgumentException((String)object);
                                throw object2;
                            }
                            this.zzbj = n3;
                            break block5;
                        } else {
                            this.zzbi = n3;
                        }
                        break block5;
                    } else {
                        this.zzbf = n3;
                    }
                    break block5;
                }
                this.zzay = n3;
                break block5;
            }
            this.zzau = n3;
        }
        object2 = this.zzap;
        object = n4;
        object2.add(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setStringInternal(FastJsonResponse$Field object, String object2, String string2) {
        int n3;
        block5: {
            block6: {
                block7: {
                    block8: {
                        block9: {
                            block10: {
                                block11: {
                                    block12: {
                                        int n4;
                                        n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                                        if (n3 == (n4 = 2)) break block6;
                                        n4 = 14;
                                        if (n3 == n4) break block7;
                                        n4 = 18;
                                        if (n3 == n4) break block8;
                                        n4 = 20;
                                        if (n3 == n4) break block9;
                                        n4 = 4;
                                        if (n3 == n4) break block10;
                                        n4 = 5;
                                        if (n3 == n4) break block11;
                                        n4 = 8;
                                        if (n3 == n4) break block12;
                                        n4 = 9;
                                        if (n3 != n4) {
                                            n4 = 26;
                                            if (n3 != n4) {
                                                n4 = 27;
                                                if (n3 != n4) {
                                                    object = oe2_0.a(54, n3, "Field with id=", " is not known to be a String.");
                                                    object2 = new IllegalArgumentException((String)object);
                                                    throw object2;
                                                }
                                                this.zzk = string2;
                                                break block5;
                                            } else {
                                                this.zzbk = string2;
                                            }
                                            break block5;
                                        } else {
                                            this.zzax = string2;
                                        }
                                        break block5;
                                    }
                                    this.zzaw = string2;
                                    break block5;
                                }
                                this.zzat = string2;
                                break block5;
                            }
                            this.zzas = string2;
                            break block5;
                        }
                        this.zzbe = string2;
                        break block5;
                    }
                    this.zzbc = string2;
                    break block5;
                }
                this.zzaz = string2;
                break block5;
            }
            this.zzaq = string2;
        }
        object2 = this.zzap;
        object = n3;
        object2.add(object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Integer n4;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        boolean bl14;
        Object object;
        boolean bl22;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zzap;
        boolean bl32 = true;
        Object object2 = (int)(bl32 ? 1 : 0);
        int n8 = set.contains(object2);
        if (n8 != 0) {
            n8 = this.zzw;
            SafeParcelWriter.writeInt(parcel, (int)(bl32 ? 1 : 0), n8);
        }
        if (bl22 = set.contains(object = Integer.valueOf(n8 = 2))) {
            object = this.zzaq;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl14 = set.contains(object = Integer.valueOf(n8 = 3))) {
            object = this.zzar;
            SafeParcelWriter.writeParcelable(parcel, n8, (Parcelable)object, n3, bl32);
        }
        if (bl13 = set.contains(object = Integer.valueOf(n8 = 4))) {
            object = this.zzas;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl12 = set.contains(object = Integer.valueOf(n8 = 5))) {
            object = this.zzat;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl11 = set.contains(object = Integer.valueOf(n8 = 6))) {
            int n10 = this.zzau;
            SafeParcelWriter.writeInt(parcel, n8, n10);
        }
        if (bl10 = set.contains(object = Integer.valueOf(n8 = 7))) {
            object = this.zzav;
            SafeParcelWriter.writeParcelable(parcel, n8, (Parcelable)object, n3, bl32);
        }
        if (bl9 = set.contains(object = Integer.valueOf(n8 = 8))) {
            object = this.zzaw;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl8 = set.contains(object = Integer.valueOf(n8 = 9))) {
            object = this.zzax;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl7 = set.contains(object = Integer.valueOf(n8 = 12))) {
            int n14 = this.zzay;
            SafeParcelWriter.writeInt(parcel, n8, n14);
        }
        if (bl6 = set.contains(object = Integer.valueOf(n8 = 14))) {
            object = this.zzaz;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl5 = set.contains(object = Integer.valueOf(n8 = 15))) {
            object = this.zzba;
            SafeParcelWriter.writeParcelable(parcel, n8, (Parcelable)object, n3, bl32);
        }
        if (bl4 = set.contains(object = Integer.valueOf(n8 = 16))) {
            boolean bl15 = this.zzbb;
            SafeParcelWriter.writeBoolean(parcel, n8, bl15);
        }
        if (bl3 = set.contains(object = Integer.valueOf(n8 = 18))) {
            object = this.zzbc;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl32);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n8 = 19))) {
            object = this.zzbd;
            SafeParcelWriter.writeParcelable(parcel, n8, (Parcelable)object, n3, bl32);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 20)) ? 1 : 0)) != 0) {
            object2 = this.zzbe;
            SafeParcelWriter.writeString(parcel, n3, (String)object2, bl32);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 21)) ? 1 : 0)) != 0) {
            n8 = this.zzbf;
            SafeParcelWriter.writeInt(parcel, n3, n8);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 22)) ? 1 : 0)) != 0) {
            object2 = this.zzbg;
            SafeParcelWriter.writeTypedList(parcel, n3, (List)object2, bl32);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 23)) ? 1 : 0)) != 0) {
            object2 = this.zzbh;
            SafeParcelWriter.writeTypedList(parcel, n3, (List)object2, bl32);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 24)) ? 1 : 0)) != 0) {
            n8 = this.zzbi;
            SafeParcelWriter.writeInt(parcel, n3, n8);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 25)) ? 1 : 0)) != 0) {
            n8 = this.zzbj;
            SafeParcelWriter.writeInt(parcel, n3, n8);
        }
        if ((n8 = (int)(set.contains(object2 = Integer.valueOf(n3 = 26)) ? 1 : 0)) != 0) {
            object2 = this.zzbk;
            SafeParcelWriter.writeString(parcel, n3, (String)object2, bl32);
        }
        if ((n3 = (int)(set.contains(n4 = Integer.valueOf(27)) ? 1 : 0)) != 0) {
            n3 = 27;
            object2 = this.zzk;
            SafeParcelWriter.writeString(parcel, n3, (String)object2, bl32);
        }
        if ((n3 = (int)(set.contains(n4 = Integer.valueOf(28)) ? 1 : 0)) != 0) {
            n3 = 28;
            object2 = this.zzbl;
            SafeParcelWriter.writeTypedList(parcel, n3, (List)object2, bl32);
        }
        if ((n3 = (int)(set.contains(n4 = Integer.valueOf(29)) ? 1 : 0)) != 0) {
            n3 = 29;
            boolean bl16 = this.zzbm;
            SafeParcelWriter.writeBoolean(parcel, n3, bl16);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

