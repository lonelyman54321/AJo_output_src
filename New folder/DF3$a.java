/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public final class DF3$a {
    public static final EF3 a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        EF3 eF3;
        block5: {
            Class<WebViewProviderFactoryBoundaryInterface> clazz;
            Object object;
            try {
                object = DF3.a();
                clazz = WebViewProviderFactoryBoundaryInterface.class;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                RuntimeException runtimeException = new RuntimeException(noSuchMethodException);
                throw runtimeException;
            }
            catch (ClassNotFoundException classNotFoundException) {
                eF3 = new Object();
                break block5;
            }
            catch (InvocationTargetException invocationTargetException) {
                RuntimeException runtimeException = new RuntimeException(invocationTargetException);
                throw runtimeException;
            }
            catch (IllegalAccessException illegalAccessException) {
                RuntimeException runtimeException = new RuntimeException(illegalAccessException);
                throw runtimeException;
            }
            object = (WebViewProviderFactoryBoundaryInterface)ea_1.a(clazz, (InvocationHandler)object);
            eF3 = new FF3((WebViewProviderFactoryBoundaryInterface)object);
        }
        a = eF3;
    }
}

