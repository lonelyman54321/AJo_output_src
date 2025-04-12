/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.database.DataSetObserver
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.Filter
 *  android.widget.Filterable
 */
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/*
 * Renamed from gf0
 */
public abstract class gf0_0
extends BaseAdapter
implements Filterable,
xf0$a {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public gf0$a e;
    public gf0$b f;
    public xf0 g;

    public abstract void b(View var1, Cursor var2);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            Object object;
            if (cursor2 != null) {
                object = this.e;
                if (object != null) {
                    cursor2.unregisterContentObserver((ContentObserver)object);
                }
                if ((object = this.f) != null) {
                    cursor2.unregisterDataSetObserver((DataSetObserver)object);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                int n3;
                object = this.e;
                if (object != null) {
                    cursor.registerContentObserver((ContentObserver)object);
                }
                if ((object = this.f) != null) {
                    cursor.registerDataSetObserver((DataSetObserver)object);
                }
                object = "_id";
                this.d = n3 = cursor.getColumnIndexOrThrow((String)object);
                n3 = 1;
                this.a = n3;
                this.notifyDataSetChanged();
            } else {
                this.d = -1;
                boolean bl2 = false;
                cursor = null;
                this.a = false;
                this.notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor var1);

    public abstract View e(ViewGroup var1);

    public final int getCount() {
        Cursor cursor;
        boolean bl2 = this.a;
        if (bl2 && (cursor = this.c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public View getDropDownView(int n3, View view, ViewGroup viewGroup) {
        boolean bl2 = this.a;
        if (bl2) {
            gf0_0 gf0_02;
            Cursor cursor = this.c;
            cursor.moveToPosition(n3);
            if (view == null) {
                gf0_02 = this;
                gf0_02 = (AK2)this;
                int n4 = ((AK2)gf0_02).i;
                bl2 = false;
                cursor = null;
                gf0_02 = ((AK2)gf0_02).j;
                view = gf0_02.inflate(n4, viewGroup, false);
            }
            gf0_02 = this.c;
            this.b(view, (Cursor)gf0_02);
            return view;
        }
        return null;
    }

    public final Filter getFilter() {
        xf0 xf02 = this.g;
        if (xf02 == null) {
            xf02 = new Filter();
            xf02.a = this;
            this.g = xf02;
        }
        return this.g;
    }

    public final Object getItem(int n3) {
        Cursor cursor;
        boolean bl2 = this.a;
        if (bl2 && (cursor = this.c) != null) {
            cursor.moveToPosition(n3);
            return this.c;
        }
        return null;
    }

    public final long getItemId(int n3) {
        Cursor cursor;
        int n4 = this.a;
        long l2 = 0L;
        if (n4 != 0 && (cursor = this.c) != null && (n3 = (int)(cursor.moveToPosition(n3) ? 1 : 0)) != 0) {
            Cursor cursor2 = this.c;
            n4 = this.d;
            return cursor2.getLong(n4);
        }
        return l2;
    }

    public View getView(int n3, View object, ViewGroup viewGroup) {
        boolean bl2 = this.a;
        if (bl2) {
            Cursor cursor = this.c;
            bl2 = cursor.moveToPosition(n3);
            if (bl2) {
                if (object == null) {
                    object = this.e(viewGroup);
                }
                Cursor cursor2 = this.c;
                this.b((View)object, cursor2);
                return object;
            }
            String string2 = hj0_0.a(n3, "couldn't move cursor to position ");
            object = new IllegalStateException(string2);
            throw object;
        }
        IllegalStateException illegalStateException = new IllegalStateException("this should only be called when the cursor is valid");
        throw illegalStateException;
    }
}

