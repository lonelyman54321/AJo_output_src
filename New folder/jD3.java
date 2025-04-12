/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public abstract class jD3 {
    private final ld3_0 impl;

    public jD3() {
        ld3_0 ld3_02;
        this.impl = ld3_02 = new ld3_0();
    }

    public jD3(i90_0 i90_02) {
        ld3_0 ld3_02;
        Intrinsics.checkNotNullParameter(i90_02, "viewModelScope");
        this.impl = ld3_02 = new ld3_0(i90_02);
    }

    public jD3(i90_0 i90_02, AutoCloseable ... autoCloseableArray) {
        ld3_0 ld3_02;
        Intrinsics.checkNotNullParameter(i90_02, "viewModelScope");
        Intrinsics.checkNotNullParameter(autoCloseableArray, "closeables");
        int n3 = autoCloseableArray.length;
        autoCloseableArray = Arrays.copyOf(autoCloseableArray, n3);
        this.impl = ld3_02 = new ld3_0(i90_02, autoCloseableArray);
    }

    public /* synthetic */ jD3(Closeable ... autoCloseableArray) {
        ld3_0 ld3_02;
        Intrinsics.checkNotNullParameter(autoCloseableArray, "closeables");
        int n3 = autoCloseableArray.length;
        autoCloseableArray = Arrays.copyOf(autoCloseableArray, n3);
        this.impl = ld3_02 = new ld3_0(autoCloseableArray);
    }

    public jD3(AutoCloseable ... autoCloseableArray) {
        ld3_0 ld3_02;
        Intrinsics.checkNotNullParameter(autoCloseableArray, "closeables");
        int n3 = autoCloseableArray.length;
        autoCloseableArray = Arrays.copyOf(autoCloseableArray, n3);
        this.impl = ld3_02 = new ld3_0(autoCloseableArray);
    }

    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        ld3_0 ld3_02 = this.impl;
        if (ld3_02 != null) {
            ld3_02.a(closeable);
        }
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        Intrinsics.checkNotNullParameter(autoCloseable, "closeable");
        ld3_0 ld3_02 = this.impl;
        if (ld3_02 != null) {
            ld3_02.a(autoCloseable);
        }
    }

    public final void addCloseable(String string2, AutoCloseable autoCloseable) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(autoCloseable, "closeable");
        ld3_0 ld3_02 = this.impl;
        if (ld3_02 != null) {
            ld3_02.b(string2, autoCloseable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void clear$lifecycle_viewmodel_release() {
        block7: {
            boolean bl2;
            Object object = this.impl;
            if (object != null && !(bl2 = ((ld3_0)object).d)) {
                ((ld3_0)object).d = bl2 = true;
                ih3_0 ih3_02 = ((ld3_0)object).a;
                synchronized (ih3_02) {
                    Throwable throwable2;
                    block6: {
                        Object object2;
                        boolean bl3;
                        Iterator iterator;
                        try {
                            iterator = ((ld3_0)object).b;
                            iterator = ((LinkedHashMap)((Object)iterator)).values();
                            iterator = iterator.iterator();
                            while (bl3 = iterator.hasNext()) {
                                object2 = iterator.next();
                                object2 = (AutoCloseable)object2;
                                ld3_0.c(object2);
                            }
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        iterator = ((ld3_0)object).c;
                        iterator = iterator.iterator();
                        while (bl3 = iterator.hasNext()) {
                            object2 = iterator.next();
                            object2 = (AutoCloseable)object2;
                            ld3_0.c(object2);
                        }
                        object = ((ld3_0)object).c;
                        object.clear();
                        object = Unit.a;
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        this.onCleared();
    }

    public final AutoCloseable getCloseable(String object) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.impl;
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object, "key");
            ih3_0 ih3_02 = ((ld3_0)object2).a;
            synchronized (ih3_02) {
                object2 = ((ld3_0)object2).b;
                object = ((LinkedHashMap)object2).get(object);
                object = (AutoCloseable)object;
            }
        } else {
            object = null;
        }
        return object;
    }

    public void onCleared() {
    }
}

