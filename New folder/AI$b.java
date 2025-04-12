/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class AI$b
implements Callable {
    public final /* synthetic */ ai_0 a;

    public AI$b(ai_0 ai_02) {
        this.a = ai_02;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        String string2 = "Activate failed: ";
        Object object = "Activated successfully with configs: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block8: {
                    Exception exception2;
                    block7: {
                        Object object2;
                        boolean bl2;
                        Object object3;
                        Object object4;
                        block10: {
                            block9: {
                                object4 = new HashMap();
                                object3 = this.a;
                                object3 = ((ai_0)object3).i;
                                bl2 = object3.isEmpty();
                                if (bl2) break block9;
                                object3 = this.a;
                                object3 = ((ai_0)object3).i;
                                ((HashMap)object4).putAll(object3);
                                object3 = this.a;
                                object3 = ((ai_0)object3).i;
                                object3.clear();
                                break block10;
                                catch (Throwable throwable2) {
                                    break block6;
                                }
                                catch (Exception exception2) {
                                    break block7;
                                }
                            }
                            object4 = this.a;
                            object3 = ((ai_0)object4).d();
                            object4 = ai_0.a((ai_0)object4, (String)object3);
                        }
                        object3 = this.a;
                        object3 = ((ai_0)object3).a;
                        object3.clear();
                        object3 = this.a;
                        object3 = ((ai_0)object3).b;
                        bl2 = object3.isEmpty();
                        if (!bl2) {
                            object3 = this.a;
                            object2 = ((ai_0)object3).a;
                            object3 = ((ai_0)object3).b;
                            object2.putAll(object3);
                        }
                        object3 = this.a;
                        object3 = ((ai_0)object3).a;
                        object3.putAll(object4);
                        object4 = this.a;
                        object4 = ((ai_0)object4).e;
                        object4 = ((CleverTapInstanceConfig)object4).b();
                        object3 = this.a;
                        object3 = ((ai_0)object3).e;
                        object3 = da2_0.a((CleverTapInstanceConfig)object3);
                        object2 = new StringBuilder((String)object);
                        object = this.a;
                        object = ((ai_0)object).a;
                        ((StringBuilder)object2).append(object);
                        object = ((StringBuilder)object2).toString();
                        ((b)object4).b((String)object3, (String)object);
                        break block8;
                    }
                    Object object5 = this.a;
                    object5 = ((ai_0)object5).e;
                    object5 = ((CleverTapInstanceConfig)object5).b();
                    Object object6 = this.a;
                    object6 = ((ai_0)object6).e;
                    object6 = da2_0.a((CleverTapInstanceConfig)object6);
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    string2 = exception2.getLocalizedMessage();
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    ((b)object5).b((String)object6, string2);
                }
                return null;
            }
            throw throwable2;
        }
    }
}

