/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.auth.api.signin.zac;
import com.google.android.gms.auth.api.signin.zad;
import com.google.android.gms.auth.api.signin.zae;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions
extends AbstractSafeParcelable
implements Api$ApiOptions$Optional,
ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zaa;
    public static final Scope zab;
    public static final Scope zac;
    public static final Scope zad;
    public static final Scope zae;
    private static final Comparator zag;
    final int zaf;
    private final ArrayList zah;
    private Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private String zam;
    private String zan;
    private ArrayList zao;
    private String zap;
    private Map zaq;

    static {
        Object object = new Scope("profile");
        zaa = object;
        object = new Scope("email");
        zab = object;
        object = new Scope("openid");
        zac = object;
        object = new Scope("https://www.googleapis.com/auth/games_lite");
        zad = object;
        Object object2 = new Scope("https://www.googleapis.com/auth/games");
        zae = object2;
        object2 = new GoogleSignInOptions$Builder();
        ((GoogleSignInOptions$Builder)object2).requestId();
        ((GoogleSignInOptions$Builder)object2).requestProfile();
        DEFAULT_SIGN_IN = ((GoogleSignInOptions$Builder)object2).build();
        object2 = new GoogleSignInOptions$Builder();
        Scope[] scopeArray = new Scope[]{};
        ((GoogleSignInOptions$Builder)object2).requestScopes((Scope)object, scopeArray);
        DEFAULT_GAMES_SIGN_IN = ((GoogleSignInOptions$Builder)object2).build();
        object = new zae();
        CREATOR = object;
        zag = object = new zac();
    }

    public GoogleSignInOptions(int n3, ArrayList arrayList, Account account, boolean bl2, boolean bl3, boolean bl4, String string2, String string3, ArrayList arrayList2, String string4) {
        Map map2 = GoogleSignInOptions.zam(arrayList2);
        this(n3, arrayList, account, bl2, bl3, bl4, string2, string3, map2, string4);
    }

    private GoogleSignInOptions(int n3, ArrayList collection, Account account, boolean bl2, boolean bl3, boolean bl4, String string2, String string3, Map map2, String string4) {
        ArrayList arrayList;
        this.zaf = n3;
        this.zah = collection;
        this.zai = account;
        this.zaj = bl2;
        this.zak = bl3;
        this.zal = bl4;
        this.zam = string2;
        this.zan = string3;
        collection = map2.values();
        this.zao = arrayList = new ArrayList(collection);
        this.zaq = map2;
        this.zap = string4;
    }

    public /* synthetic */ GoogleSignInOptions(int n3, ArrayList arrayList, Account account, boolean bl2, boolean bl3, boolean bl4, String string2, String string3, Map map2, String string4, zad zad2) {
        this(3, arrayList, account, bl2, bl3, bl4, string2, string3, map2, string4);
    }

    public static /* bridge */ /* synthetic */ Account zaa(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zai;
    }

    public static GoogleSignInOptions zab(String string2) {
        Account account;
        Scope scope;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = null;
        if (bl2) {
            return null;
        }
        Object object = string2;
        JSONObject jSONObject = new JSONObject(string2);
        object = new HashSet();
        Object object2 = jSONObject.getJSONArray("scopes");
        int n3 = object2.length();
        String string4 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string5 = object2.getString(i3);
            scope = new Scope(string5);
            ((HashSet)object).add(scope);
        }
        object2 = "accountName";
        n3 = (int)(jSONObject.has((String)object2) ? 1 : 0);
        object2 = n3 != 0 ? jSONObject.optString((String)object2) : null;
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 == 0) {
            Account account2;
            string4 = "com.google";
            account = account2 = new Account((String)object2, string4);
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(object);
        boolean bl3 = jSONObject.getBoolean("idTokenRequested");
        boolean bl4 = jSONObject.getBoolean("serverAuthRequested");
        boolean bl5 = jSONObject.getBoolean("forceCodeForRefreshToken");
        object = "serverClientId";
        n3 = (int)(jSONObject.has((String)object) ? 1 : 0);
        Object object3 = n3 != 0 ? (object = jSONObject.optString((String)object)) : null;
        object = "hostedDomain";
        n3 = (int)(jSONObject.has((String)object) ? 1 : 0);
        if (n3 != 0) {
            string3 = jSONObject.optString((String)object);
        }
        HashMap hashMap = new HashMap();
        scope = object2;
        object2 = new GoogleSignInOptions(3, arrayList, account, bl3, bl4, bl5, (String)object3, string3, hashMap, null);
        return object2;
    }

    public static /* bridge */ /* synthetic */ String zac(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zan;
    }

    public static /* bridge */ /* synthetic */ String zad(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zap;
    }

    public static /* bridge */ /* synthetic */ String zae(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zam;
    }

    public static /* bridge */ /* synthetic */ ArrayList zag(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zao;
    }

    public static /* bridge */ /* synthetic */ ArrayList zah(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zah;
    }

    public static /* bridge */ /* synthetic */ Map zai(List list) {
        return GoogleSignInOptions.zam(list);
    }

    public static /* bridge */ /* synthetic */ boolean zaj(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zal;
    }

    public static /* bridge */ /* synthetic */ boolean zak(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zaj;
    }

    public static /* bridge */ /* synthetic */ boolean zal(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.zak;
    }

    private static Map zam(List object) {
        HashMap<Integer, GoogleSignInOptionsExtensionParcelable> hashMap = new HashMap<Integer, GoogleSignInOptionsExtensionParcelable>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable)object.next();
                int n3 = googleSignInOptionsExtensionParcelable.getType();
                Integer n4 = n3;
                hashMap.put(n4, googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public boolean equals(Object object) {
        block35: {
            int n3;
            Object object2;
            block39: {
                Object object3;
                block38: {
                    block37: {
                        block36: {
                            if (object == null) {
                                return false;
                            }
                            try {
                                object = (GoogleSignInOptions)object;
                            }
                            catch (ClassCastException classCastException) {}
                            object2 = this.zao;
                            boolean n4 = ((ArrayList)object2).isEmpty();
                            if (!n4) break block35;
                            object2 = ((GoogleSignInOptions)object).zao;
                            boolean bl2 = ((ArrayList)object2).isEmpty();
                            if (!bl2) break block35;
                            object2 = this.zah;
                            int n7 = ((ArrayList)object2).size();
                            object3 = ((GoogleSignInOptions)object).getScopes();
                            n3 = ((ArrayList)object3).size();
                            if (n7 != n3) break block35;
                            object2 = this.zah;
                            object3 = ((GoogleSignInOptions)object).getScopes();
                            boolean bl3 = ((AbstractCollection)object2).containsAll((Collection<?>)object3);
                            if (!bl3) break block35;
                            object2 = this.zai;
                            if (object2 != null) break block36;
                            object2 = ((GoogleSignInOptions)object).getAccount();
                            if (object2 != null) break block35;
                            break block37;
                        }
                        object3 = ((GoogleSignInOptions)object).getAccount();
                        boolean bl4 = object2.equals(object3);
                        if (!bl4) break block35;
                    }
                    object2 = this.zam;
                    boolean bl5 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl5) break block38;
                    object2 = ((GoogleSignInOptions)object).getServerClientId();
                    boolean bl6 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl6) break block35;
                    break block39;
                }
                object2 = this.zam;
                object3 = ((GoogleSignInOptions)object).getServerClientId();
                boolean bl7 = ((String)object2).equals(object3);
                if (!bl7) break block35;
            }
            int n8 = this.zal;
            n3 = (int)(((GoogleSignInOptions)object).isForceCodeForRefreshToken() ? 1 : 0);
            if (n8 != n3) break block35;
            int n10 = this.zaj;
            n3 = (int)(((GoogleSignInOptions)object).isIdTokenRequested() ? 1 : 0);
            if (n10 != n3) break block35;
            int n14 = this.zak;
            n3 = (int)(((GoogleSignInOptions)object).isServerAuthCodeRequested() ? 1 : 0);
            if (n14 != n3) break block35;
            object2 = this.zap;
            object = ((GoogleSignInOptions)object).getLogSessionId();
            boolean bl8 = TextUtils.equals((CharSequence)object2, (CharSequence)object);
            if (bl8) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount() {
        return this.zai;
    }

    public ArrayList getExtensions() {
        return this.zao;
    }

    public String getLogSessionId() {
        return this.zap;
    }

    public Scope[] getScopeArray() {
        Scope[] scopeArray = new Scope[this.zah.size()];
        return this.zah.toArray(scopeArray);
    }

    public ArrayList getScopes() {
        ArrayList arrayList = this.zah;
        ArrayList arrayList2 = new ArrayList(arrayList);
        return arrayList2;
    }

    public String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        Object object = new ArrayList();
        Object object2 = this.zah;
        int n3 = object2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = ((Scope)object2.get(i3)).getScopeUri();
            object.add(string2);
        }
        Collections.sort(object);
        object2 = new HashAccumulator();
        ((HashAccumulator)object2).addObject(object);
        object = this.zai;
        ((HashAccumulator)object2).addObject(object);
        object = this.zam;
        ((HashAccumulator)object2).addObject(object);
        boolean bl2 = this.zal;
        ((HashAccumulator)object2).zaa(bl2);
        bl2 = this.zaj;
        ((HashAccumulator)object2).zaa(bl2);
        bl2 = this.zak;
        ((HashAccumulator)object2).zaa(bl2);
        object = this.zap;
        ((HashAccumulator)object2).addObject(object);
        return ((HashAccumulator)object2).hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int bl2 = this.zaf;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        Object object = this.getScopes();
        SafeParcelWriter.writeTypedList(parcel, 2, (List)object, false);
        Account account = this.getAccount();
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)account, n3, false);
        boolean bl3 = this.isIdTokenRequested();
        SafeParcelWriter.writeBoolean(parcel, 4, bl3);
        boolean bl4 = this.isServerAuthCodeRequested();
        SafeParcelWriter.writeBoolean(parcel, 5, bl4);
        boolean bl5 = this.isForceCodeForRefreshToken();
        SafeParcelWriter.writeBoolean(parcel, 6, bl5);
        object = this.getServerClientId();
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        object = this.zan;
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        object = this.getExtensions();
        SafeParcelWriter.writeTypedList(parcel, 9, (List)object, false);
        object = this.getLogSessionId();
        SafeParcelWriter.writeString(parcel, 10, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zaf() {
        JSONException jSONException2;
        block6: {
            Object object;
            Object object2;
            JSONObject jSONObject = new JSONObject();
            try {
                boolean bl2;
                object2 = new JSONArray();
                object = this.zah;
                Object object3 = zag;
                Collections.sort(object, object3);
                object = this.zah;
                object = ((ArrayList)object).iterator();
                while (bl2 = object.hasNext()) {
                    object3 = object.next();
                    object3 = (Scope)object3;
                    object3 = ((Scope)object3).getScopeUri();
                    object2.put(object3);
                }
            }
            catch (JSONException jSONException2) {
                break block6;
            }
            object = "scopes";
            jSONObject.put((String)object, object2);
            object2 = this.zai;
            if (object2 != null) {
                object = "accountName";
                object2 = object2.name;
                jSONObject.put((String)object, object2);
            }
            object2 = "idTokenRequested";
            boolean bl3 = this.zaj;
            jSONObject.put((String)object2, bl3);
            object2 = "forceCodeForRefreshToken";
            bl3 = this.zal;
            jSONObject.put((String)object2, bl3);
            object2 = "serverAuthRequested";
            bl3 = this.zak;
            jSONObject.put((String)object2, bl3);
            object2 = this.zam;
            boolean bl4 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl4) {
                object2 = "serverClientId";
                object = this.zam;
                jSONObject.put((String)object2, object);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object2 = this.zan)))) {
                object2 = "hostedDomain";
                object = this.zan;
                jSONObject.put((String)object2, object);
            }
            return jSONObject.toString();
        }
        RuntimeException runtimeException = new RuntimeException(jSONException2);
        throw runtimeException;
    }
}

