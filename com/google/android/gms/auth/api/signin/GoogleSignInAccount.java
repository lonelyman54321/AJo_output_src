/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.net.Uri
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
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.zaa;
import com.google.android.gms.auth.api.signin.zab;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Clock zaa;
    final int zab;
    final List zac;
    private final String zad;
    private final String zae;
    private final String zaf;
    private final String zag;
    private final Uri zah;
    private String zai;
    private final long zaj;
    private final String zak;
    private final String zal;
    private final String zam;
    private final Set zan;

    static {
        zab zab2 = new zab();
        CREATOR = zab2;
        zaa = DefaultClock.getInstance();
    }

    public GoogleSignInAccount(int n3, String string2, String string3, String string4, String string5, Uri uri, String string6, long l2, String string7, List list, String string8, String string9) {
        HashSet hashSet;
        this.zan = hashSet = new HashSet();
        this.zab = n3;
        this.zad = string2;
        this.zae = string3;
        this.zaf = string4;
        this.zag = string5;
        this.zah = uri;
        this.zai = string6;
        this.zaj = l2;
        this.zak = string7;
        this.zac = list;
        this.zal = string8;
        this.zam = string9;
    }

    public static GoogleSignInAccount createDefault() {
        Account account = new Account("<<default account>>", "com.google");
        HashSet hashSet = new HashSet();
        return GoogleSignInAccount.zae(account, hashSet);
    }

    public static GoogleSignInAccount fromAccount(Account account) {
        Np np = new Np();
        return GoogleSignInAccount.zae(account, np);
    }

    public static GoogleSignInAccount fromAccountAndScopes(Account account, Scope object, Scope ... scopeArray) {
        Preconditions.checkNotNull(account);
        Preconditions.checkNotNull(object);
        HashSet<Scope> hashSet = new HashSet<Scope>();
        hashSet.add((Scope)object);
        object = Arrays.asList(scopeArray);
        hashSet.addAll((Collection<Scope>)object);
        return GoogleSignInAccount.zae(account, hashSet);
    }

    public static GoogleSignInAccount zaa(String string2, String string3, String string4, String string5, String string6, String string7, Uri uri, Long l2, String string8, Set set) {
        GoogleSignInAccount googleSignInAccount;
        long l3 = l2;
        String string9 = Preconditions.checkNotEmpty(string8);
        Object object = (Collection)Preconditions.checkNotNull(set);
        ArrayList arrayList = new ArrayList(object);
        object = googleSignInAccount;
        googleSignInAccount = new GoogleSignInAccount(3, string2, string3, string4, string5, uri, null, l3, string9, arrayList, string6, string7);
        return googleSignInAccount;
    }

    public static GoogleSignInAccount zab(String object) {
        Object object2;
        String string2;
        int n3;
        String string3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        String string4 = null;
        if (bl2) {
            return null;
        }
        JSONObject jSONObject = new JSONObject((String)object);
        boolean bl3 = TextUtils.isEmpty((CharSequence)(object = jSONObject.optString("photoUrl")));
        if (!bl3) {
            object = Uri.parse((String)object);
            string3 = object;
        } else {
            string3 = null;
        }
        long l2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet<Scope> hashSet = new HashSet<Scope>();
        object = jSONObject.getJSONArray("grantedScopes");
        int n4 = object.length();
        Object object3 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            string2 = object.getString(n3);
            object2 = new Scope(string2);
            hashSet.add((Scope)object2);
        }
        object = jSONObject.optString("id");
        String string5 = "tokenId";
        n3 = (int)(jSONObject.has(string5) ? 1 : 0);
        if (n3 != 0) {
            string5 = jSONObject.optString(string5);
        } else {
            n4 = 0;
            string5 = null;
        }
        object3 = "email";
        boolean bl4 = jSONObject.has((String)object3);
        if (bl4) {
            object3 = jSONObject.optString((String)object3);
        } else {
            n3 = 0;
            object3 = null;
        }
        object2 = "displayName";
        boolean bl5 = jSONObject.has((String)object2);
        if (bl5) {
            object2 = jSONObject.optString((String)object2);
        } else {
            bl4 = false;
            object2 = null;
        }
        string2 = "givenName";
        boolean bl6 = jSONObject.has(string2);
        if (bl6) {
            string2 = jSONObject.optString(string2);
        } else {
            bl5 = false;
            string2 = null;
        }
        Object object4 = "familyName";
        boolean bl7 = jSONObject.has((String)object4);
        if (bl7) {
            object4 = jSONObject.optString((String)object4);
        } else {
            bl6 = false;
            object4 = null;
        }
        Object object5 = l2;
        String string6 = jSONObject.getString("obfuscatedIdentifier");
        String string7 = object;
        String string8 = string5;
        string5 = object3;
        object3 = object2;
        object2 = string2;
        string2 = object4;
        object4 = object5;
        object5 = string6;
        object = GoogleSignInAccount.zaa((String)object, string8, string5, (String)object3, (String)object2, string2, (Uri)string3, (Long)object4, string6, hashSet);
        string7 = "serverAuthCode";
        boolean bl8 = jSONObject.has(string7);
        if (bl8) {
            string4 = jSONObject.optString(string7);
        }
        ((GoogleSignInAccount)object).zai = string4;
        return object;
    }

    private static GoogleSignInAccount zae(Account account, Set set) {
        String string2 = account.name;
        Long l2 = 0L;
        String string3 = account.name;
        return GoogleSignInAccount.zaa(null, null, string2, null, null, null, null, l2, string3, set);
    }

    public boolean equals(Object object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof GoogleSignInAccount;
        if (!bl4) {
            return false;
        }
        object = (GoogleSignInAccount)object;
        Object object2 = ((GoogleSignInAccount)object).zak;
        String string2 = this.zak;
        bl4 = ((String)object2).equals(string2);
        if (bl4 && (bl2 = (object = ((GoogleSignInAccount)object).getRequestedScopes()).equals(object2 = this.getRequestedScopes()))) {
            return bl3;
        }
        return false;
    }

    public Account getAccount() {
        String string2 = this.zaf;
        if (string2 == null) {
            return null;
        }
        Account account = new Account(string2, "com.google");
        return account;
    }

    public String getDisplayName() {
        return this.zag;
    }

    public String getEmail() {
        return this.zaf;
    }

    public String getFamilyName() {
        return this.zam;
    }

    public String getGivenName() {
        return this.zal;
    }

    public Set getGrantedScopes() {
        List list = this.zac;
        HashSet hashSet = new HashSet(list);
        return hashSet;
    }

    public String getId() {
        return this.zad;
    }

    public String getIdToken() {
        return this.zae;
    }

    public Uri getPhotoUrl() {
        return this.zah;
    }

    public Set getRequestedScopes() {
        Collection collection = this.zac;
        HashSet hashSet = new HashSet(collection);
        collection = this.zan;
        hashSet.addAll(collection);
        return hashSet;
    }

    public String getServerAuthCode() {
        return this.zai;
    }

    public int hashCode() {
        int n3 = this.zak.hashCode() + 527;
        int n4 = ((Object)this.getRequestedScopes()).hashCode();
        return n3 * 31 + n4;
    }

    public boolean isExpired() {
        Clock clock = zaa;
        long l2 = clock.currentTimeMillis() / 1000L;
        long l3 = this.zaj;
        long l4 = -300L;
        long l7 = l2 - (l3 += l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        return object >= 0;
    }

    public GoogleSignInAccount requestExtraScopes(Scope ... scopeArray) {
        if (scopeArray != null) {
            Set set = this.zan;
            Collections.addAll(set, scopeArray);
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zab;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        Object object = this.getId();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        String string2 = this.getIdToken();
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        string2 = this.getEmail();
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        string2 = this.getDisplayName();
        SafeParcelWriter.writeString(parcel, 5, string2, false);
        string2 = this.getPhotoUrl();
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)string2, n3, false);
        object = this.getServerAuthCode();
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        long l2 = this.zaj;
        SafeParcelWriter.writeLong(parcel, 8, l2);
        object = this.zak;
        SafeParcelWriter.writeString(parcel, 9, (String)object, false);
        object = this.zac;
        SafeParcelWriter.writeTypedList(parcel, 10, (List)object, false);
        object = this.getGivenName();
        SafeParcelWriter.writeString(parcel, 11, (String)object, false);
        object = this.getFamilyName();
        SafeParcelWriter.writeString(parcel, 12, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final String zac() {
        return this.zak;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zad() {
        JSONException jSONException2;
        block11: {
            Object object;
            String string2;
            String string3;
            JSONObject jSONObject;
            block10: {
                jSONObject = new JSONObject();
                try {
                    string3 = this.getId();
                    if (string3 == null) break block10;
                    string3 = "id";
                    string2 = this.getId();
                    jSONObject.put(string3, (Object)string2);
                }
                catch (JSONException jSONException2) {
                    break block11;
                }
            }
            if ((string3 = this.getIdToken()) != null) {
                string3 = "tokenId";
                string2 = this.getIdToken();
                jSONObject.put(string3, (Object)string2);
            }
            if ((string3 = this.getEmail()) != null) {
                string3 = "email";
                string2 = this.getEmail();
                jSONObject.put(string3, (Object)string2);
            }
            if ((string3 = this.getDisplayName()) != null) {
                string3 = "displayName";
                string2 = this.getDisplayName();
                jSONObject.put(string3, (Object)string2);
            }
            if ((string3 = this.getGivenName()) != null) {
                string3 = "givenName";
                string2 = this.getGivenName();
                jSONObject.put(string3, (Object)string2);
            }
            if ((string3 = this.getFamilyName()) != null) {
                string3 = "familyName";
                string2 = this.getFamilyName();
                jSONObject.put(string3, (Object)string2);
            }
            if ((string3 = this.getPhotoUrl()) != null) {
                string2 = "photoUrl";
                string3 = string3.toString();
                jSONObject.put(string2, (Object)string3);
            }
            string3 = this.getServerAuthCode();
            string2 = "serverAuthCode";
            if (string3 != null) {
                string3 = this.getServerAuthCode();
                jSONObject.put(string2, (Object)string3);
            }
            string3 = "expirationTime";
            long l2 = this.zaj;
            jSONObject.put(string3, l2);
            string3 = "obfuscatedIdentifier";
            Object object2 = this.zak;
            jSONObject.put(string3, object2);
            string3 = new JSONArray();
            object2 = this.zac;
            int n3 = object2.size();
            Object object3 = new Scope[n3];
            object2 = object2.toArray((T[])object3);
            object3 = com.google.android.gms.auth.api.signin.zaa.zaa;
            Arrays.sort(object2, object3);
            n3 = ((Scope[])object2).length;
            for (int n4 = 0; n4 < n3; object = ((Scope)object).getScopeUri(), ++n4) {
                object = object2[n4];
                string3.put(object);
            }
            object2 = "grantedScopes";
            jSONObject.put((String)object2, (Object)string3);
            jSONObject.remove(string2);
            return jSONObject.toString();
        }
        RuntimeException runtimeException = new RuntimeException(jSONException2);
        throw runtimeException;
    }
}

