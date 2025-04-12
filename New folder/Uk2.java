/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObservable
 *  android.database.DataSetObserver
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class Uk2 {
    public final DataSetObservable a;
    public DataSetObserver b;

    public Uk2() {
        DataSetObservable dataSetObservable;
        this.a = dataSetObservable = new DataSetObservable();
    }

    public void a(ViewGroup object, int n3, Object object2) {
        object = new UnsupportedOperationException("Required method destroyItem was not overridden");
        throw object;
    }

    public void b() {
    }

    public abstract int c();

    public void d(Object object) {
    }

    public CharSequence e(int n3) {
        return null;
    }

    public Object f(int n3, ViewGroup viewGroup) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Required method instantiateItem was not overridden");
        throw unsupportedOperationException;
    }

    public abstract boolean g(View var1, Object var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h() {
        // MONITORENTER : this
        DataSetObserver dataSetObserver = this.b;
        if (dataSetObserver != null) {
            dataSetObserver.onChanged();
        }
        this.a.notifyChanged();
    }

    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable j() {
        return null;
    }

    public void k(Object object) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
            return;
        }
    }

    public void m(ViewGroup viewGroup) {
    }
}

