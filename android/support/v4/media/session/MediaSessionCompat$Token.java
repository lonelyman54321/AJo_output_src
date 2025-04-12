/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaSession$Token
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$Stub;
import android.support.v4.media.session.MediaSessionCompat$Token$1;
import androidx.versionedparcelable.ParcelImpl;

public final class MediaSessionCompat$Token
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private IMediaSession mExtraBinder;
    private final Object mInner;
    private final Object mLock;
    private qB3 mSession2Token;

    static {
        MediaSessionCompat$Token$1 mediaSessionCompat$Token$1 = new MediaSessionCompat$Token$1();
        CREATOR = mediaSessionCompat$Token$1;
    }

    public MediaSessionCompat$Token(Object object) {
        this(object, null, null);
    }

    public MediaSessionCompat$Token(Object object, IMediaSession iMediaSession) {
        this(object, iMediaSession, null);
    }

    public MediaSessionCompat$Token(Object object, IMediaSession iMediaSession, qB3 qB32) {
        Object object2;
        this.mLock = object2 = new Object();
        this.mInner = object;
        this.mExtraBinder = iMediaSession;
        this.mSession2Token = qB32;
    }

    public static MediaSessionCompat$Token fromBundle(Bundle object) {
        MediaSessionCompat$Token mediaSessionCompat$Token = null;
        if (object == null) {
            return null;
        }
        Object object2 = MediaSessionCompat$Token.class.getClassLoader();
        object.setClassLoader((ClassLoader)object2);
        object2 = IMediaSession$Stub.asInterface(object.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
        qB3 qB32 = Qm2.a(object);
        String string2 = "android.support.v4.media.session.TOKEN";
        object = (MediaSessionCompat$Token)object.getParcelable(string2);
        if (object != null) {
            object = object.mInner;
            mediaSessionCompat$Token = new MediaSessionCompat$Token(object, (IMediaSession)object2, qB32);
        }
        return mediaSessionCompat$Token;
    }

    public static MediaSessionCompat$Token fromToken(Object object) {
        return MediaSessionCompat$Token.fromToken(object, null);
    }

    public static MediaSessionCompat$Token fromToken(Object object, IMediaSession iMediaSession) {
        if (object != null) {
            boolean bl2 = object instanceof MediaSession.Token;
            if (bl2) {
                MediaSessionCompat$Token mediaSessionCompat$Token = new MediaSessionCompat$Token(object, iMediaSession);
                return mediaSessionCompat$Token;
            }
            object = new IllegalArgumentException("token is not a valid MediaSession.Token object");
            throw object;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MediaSessionCompat$Token;
        if (!bl3) {
            return false;
        }
        object = (MediaSessionCompat$Token)object;
        Object object2 = this.mInner;
        if (object2 == null) {
            object = ((MediaSessionCompat$Token)object).mInner;
            if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        object = ((MediaSessionCompat$Token)object).mInner;
        if (object == null) {
            return false;
        }
        return object2.equals(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IMediaSession getExtraBinder() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mExtraBinder;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public qB3 getSession2Token() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mSession2Token;
        }
    }

    public Object getToken() {
        return this.mInner;
    }

    public int hashCode() {
        Object object = this.mInner;
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setExtraBinder(IMediaSession iMediaSession) {
        Object object = this.mLock;
        synchronized (object) {
            this.mExtraBinder = iMediaSession;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSession2Token(qB3 qB32) {
        Object object = this.mLock;
        synchronized (object) {
            this.mSession2Token = qB32;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.TOKEN", (Parcelable)this);
        Object object = this.mLock;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                String string2;
                Object object2;
                block4: {
                    try {
                        object2 = this.mExtraBinder;
                        if (object2 == null) break block4;
                        string2 = "android.support.v4.media.session.EXTRA_BINDER";
                        object2 = object2.asBinder();
                        bundle.putBinder(string2, (IBinder)object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((object2 = this.mSession2Token) != null) {
                    string2 = new Bundle();
                    ParcelImpl parcelImpl = new ParcelImpl((qB3)object2);
                    object2 = "a";
                    string2.putParcelable((String)object2, (Parcelable)parcelImpl);
                    object2 = "android.support.v4.media.session.SESSION_TOKEN2";
                    bundle.putParcelable((String)object2, (Parcelable)string2);
                }
                return bundle;
            }
            throw throwable2;
        }
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Parcelable parcelable = (Parcelable)this.mInner;
        parcel.writeParcelable(parcelable, n3);
    }
}

