/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.PlaybackState$CustomAction
 *  android.media.session.PlaybackState$CustomAction$Builder
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat$Api21Impl;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction$1;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mAction;
    private PlaybackState.CustomAction mCustomActionFwk;
    private final Bundle mExtras;
    private final int mIcon;
    private final CharSequence mName;

    static {
        PlaybackStateCompat$CustomAction$1 playbackStateCompat$CustomAction$1 = new PlaybackStateCompat$CustomAction$1();
        CREATOR = playbackStateCompat$CustomAction$1;
    }

    public PlaybackStateCompat$CustomAction(Parcel parcel) {
        int n3;
        Object object = parcel.readString();
        this.mAction = object;
        object = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mName = object;
        this.mIcon = n3 = parcel.readInt();
        object = MediaSessionCompat.class.getClassLoader();
        parcel = parcel.readBundle((ClassLoader)object);
        this.mExtras = parcel;
    }

    public PlaybackStateCompat$CustomAction(String string2, CharSequence charSequence, int n3, Bundle bundle) {
        this.mAction = string2;
        this.mName = charSequence;
        this.mIcon = n3;
        this.mExtras = bundle;
    }

    public static PlaybackStateCompat$CustomAction fromCustomAction(Object object) {
        if (object != null) {
            object = (PlaybackState.CustomAction)object;
            Bundle bundle = PlaybackStateCompat$Api21Impl.getExtras((PlaybackState.CustomAction)object);
            MediaSessionCompat.ensureClassLoader(bundle);
            String string2 = PlaybackStateCompat$Api21Impl.getAction((PlaybackState.CustomAction)object);
            CharSequence charSequence = PlaybackStateCompat$Api21Impl.getName((PlaybackState.CustomAction)object);
            int n3 = PlaybackStateCompat$Api21Impl.getIcon((PlaybackState.CustomAction)object);
            PlaybackStateCompat$CustomAction playbackStateCompat$CustomAction = new PlaybackStateCompat$CustomAction(string2, charSequence, n3, bundle);
            playbackStateCompat$CustomAction.mCustomActionFwk = object;
            return playbackStateCompat$CustomAction;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.mAction;
    }

    public Object getCustomAction() {
        Object object = this.mCustomActionFwk;
        if (object == null) {
            object = this.mAction;
            CharSequence charSequence = this.mName;
            int n3 = this.mIcon;
            object = PlaybackStateCompat$Api21Impl.createCustomActionBuilder((String)object, charSequence, n3);
            charSequence = this.mExtras;
            PlaybackStateCompat$Api21Impl.setExtras((PlaybackState.CustomAction.Builder)object, (Bundle)charSequence);
            object = PlaybackStateCompat$Api21Impl.build((PlaybackState.CustomAction.Builder)object);
        }
        return object;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public int getIcon() {
        return this.mIcon;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Action:mName='");
        CharSequence charSequence = this.mName;
        stringBuilder.append((Object)charSequence);
        stringBuilder.append(", mIcon=");
        int n3 = this.mIcon;
        stringBuilder.append(n3);
        stringBuilder.append(", mExtras=");
        charSequence = this.mExtras;
        stringBuilder.append((Object)charSequence);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.mAction;
        parcel.writeString(string2);
        TextUtils.writeToParcel((CharSequence)this.mName, (Parcel)parcel, (int)n3);
        n3 = this.mIcon;
        parcel.writeInt(n3);
        Bundle bundle = this.mExtras;
        parcel.writeBundle(bundle);
    }
}

