/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package androidx.loader.content;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.loader.content.a$a;
import androidx.loader.content.a$b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class a {
    boolean mAbandoned = false;
    boolean mContentChanged = false;
    Context mContext;
    int mId;
    a$b mListener;
    a$a mOnLoadCanceledListener;
    boolean mProcessingChange = false;
    boolean mReset = true;
    boolean mStarted = false;

    public a(Context context) {
        this.mContext = context = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        this.onAbandon();
    }

    public boolean cancelLoad() {
        return this.onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object object) {
        StringBuilder stringBuilder = new StringBuilder(64);
        ii1.b(stringBuilder, object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(Object object) {
        a$b a$b = this.mListener;
        if (a$b != null) {
            a$b = (vv1$a_0)a$b;
            a$b.getClass();
            Looper looper = Looper.myLooper();
            Looper looper2 = Looper.getMainLooper();
            if (looper == looper2) {
                ((vv1$a_0)a$b).k(object);
            } else {
                ((LiveData)((Object)a$b)).i(object);
            }
        }
    }

    public void dump(String string2, FileDescriptor object, PrintWriter printWriter, String[] stringArray) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        printWriter.print(string2);
        printWriter.print("mId=");
        int bl22 = this.mId;
        printWriter.print(bl22);
        printWriter.print(" mListener=");
        object = this.mListener;
        printWriter.println(object);
        boolean bl6 = this.mStarted;
        if (bl6 || (bl5 = this.mContentChanged) || (bl4 = this.mProcessingChange)) {
            printWriter.print(string2);
            printWriter.print("mStarted=");
            boolean bl7 = this.mStarted;
            printWriter.print(bl7);
            printWriter.print(" mContentChanged=");
            boolean bl8 = this.mContentChanged;
            printWriter.print(bl8);
            object = " mProcessingChange=";
            printWriter.print((String)object);
            boolean bl9 = this.mProcessingChange;
            printWriter.println(bl9);
        }
        if ((bl3 = this.mAbandoned) || (bl2 = this.mReset)) {
            printWriter.print(string2);
            printWriter.print("mAbandoned=");
            boolean bl10 = this.mAbandoned;
            printWriter.print(bl10);
            string2 = " mReset=";
            printWriter.print(string2);
            bl10 = this.mReset;
            printWriter.println(bl10);
        }
    }

    public void forceLoad() {
        this.onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        boolean bl2 = this.mStarted;
        if (bl2) {
            this.forceLoad();
        } else {
            this.mContentChanged = bl2 = true;
        }
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public void onStartLoading() {
    }

    public void onStopLoading() {
    }

    public void registerListener(int n3, a$b a$b) {
        a$b a$b2 = this.mListener;
        if (a$b2 == null) {
            this.mListener = a$b;
            this.mId = n3;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("There is already a listener registered");
        throw illegalStateException;
    }

    public void registerOnLoadCanceledListener(a$a a$a) {
    }

    public void reset() {
        this.onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        boolean bl2 = this.mProcessingChange;
        if (bl2) {
            this.onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        this.onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        this.onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean bl2;
        boolean bl3 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange = bl2 = this.mProcessingChange | bl3;
        return bl3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        ii1.b(stringBuilder, this);
        stringBuilder.append(" id=");
        return g30.a(this.mId, "}", stringBuilder);
    }

    public void unregisterListener(a$b object) {
        a$b a$b = this.mListener;
        if (a$b != null) {
            if (a$b == object) {
                this.mListener = null;
                return;
            }
            object = new IllegalArgumentException("Attempting to unregister the wrong listener");
            throw object;
        }
        object = new IllegalStateException("No listener register");
        throw object;
    }

    public void unregisterOnLoadCanceledListener(a$a object) {
        object = new IllegalStateException("No listener register");
        throw object;
    }
}

