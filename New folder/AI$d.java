/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AI$d
implements Callable {
    public final /* synthetic */ ai_0 a;

    public AI$d(ai_0 ai_02) {
        this.a = ai_02;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = "InitAsync failed - ";
        Object object2 = "Loaded configs ready to be applied: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block9: {
                    Exception exception2;
                    block7: {
                        Object object3;
                        boolean bl2;
                        Object object4;
                        block8: {
                            object4 = this.a;
                            object4 = ((ai_0)object4).b;
                            bl2 = object4.isEmpty();
                            if (bl2) break block8;
                            object4 = this.a;
                            object3 = ((ai_0)object4).a;
                            object4 = ((ai_0)object4).b;
                            object3.putAll(object4);
                            break block8;
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            catch (Exception exception2) {
                                break block7;
                            }
                        }
                        object4 = this.a;
                        object3 = ((ai_0)object4).d();
                        boolean bl3 = ((HashMap)(object4 = ai_0.a((ai_0)object4, (String)object3))).isEmpty();
                        if (!bl3) {
                            object3 = this.a;
                            object3 = ((ai_0)object3).i;
                            object3.putAll(object4);
                        }
                        object4 = this.a;
                        object4 = ((ai_0)object4).e;
                        object4 = ((CleverTapInstanceConfig)object4).b();
                        object3 = this.a;
                        object3 = ((ai_0)object3).e;
                        object3 = da2_0.a((CleverTapInstanceConfig)object3);
                        StringBuilder stringBuilder = new StringBuilder((String)object2);
                        object2 = this.a;
                        object2 = ((ai_0)object2).i;
                        stringBuilder.append(object2);
                        object2 = stringBuilder.toString();
                        ((b)object4).b((String)object3, (String)object2);
                        object2 = this.a;
                        object4 = ((ai_0)object2).h;
                        object2 = ((ai_0)object2).d;
                        ((cA2)object4).f((lm0_1)object2);
                        object2 = this.a;
                        object2 = ((ai_0)object2).c;
                        bl2 = true;
                        ((AtomicBoolean)object2).set(bl2);
                        object = Boolean.TRUE;
                        break block9;
                    }
                    Object object5 = this.a;
                    object5 = ((ai_0)object5).e;
                    object5 = ((CleverTapInstanceConfig)object5).b();
                    Object object6 = this.a;
                    object6 = ((ai_0)object6).e;
                    object6 = da2_0.a((CleverTapInstanceConfig)object6);
                    StringBuilder stringBuilder = new StringBuilder((String)object);
                    object = exception2.getLocalizedMessage();
                    stringBuilder.append((String)object);
                    object = stringBuilder.toString();
                    ((b)object5).b((String)object6, (String)object);
                    object = Boolean.FALSE;
                }
                return object;
            }
            throw throwable2;
        }
    }
}

