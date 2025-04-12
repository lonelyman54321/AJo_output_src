/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidator;
import com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder;
import com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.m;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class FuturesGetChecked {
    private static final Ordering ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST;
    private static final Ordering WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM;

    static {
        Ordering ordering = Ordering.natural();
        Object object = new Object();
        ordering = ordering.onResultOf((Function)object);
        object = Ordering.natural();
        m m2 = new Object();
        object = ((Ordering)object).onResultOf(m2);
        ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST = ordering = ordering.compound((Comparator)object).reverse();
        object = new Object();
        WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM = ordering.onResultOf((Function)object);
    }

    private FuturesGetChecked() {
    }

    public static /* synthetic */ Comparable a(List list) {
        return FuturesGetChecked.lambda$static$0(list);
    }

    public static /* synthetic */ Comparable b(List list) {
        return FuturesGetChecked.lambda$static$1(list);
    }

    private static FuturesGetChecked$GetCheckedTypeValidator bestGetCheckedTypeValidator() {
        return FuturesGetChecked$GetCheckedTypeValidatorHolder.BEST_VALIDATOR;
    }

    public static /* synthetic */ List c(Constructor constructor) {
        return FuturesGetChecked.lambda$static$2(constructor);
    }

    public static void checkExceptionClassValidity(Class clazz) {
        Preconditions.checkArgument(FuturesGetChecked.isCheckedException(clazz), "Futures.getChecked exception type (%s) must not be a RuntimeException", (Object)clazz);
        Preconditions.checkArgument(FuturesGetChecked.hasConstructorUsableByGetChecked(clazz), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", (Object)clazz);
    }

    public static Object getChecked(FuturesGetChecked$GetCheckedTypeValidator object, Future future, Class clazz) {
        object.validateClass(clazz);
        try {
            return future.get();
        }
        catch (ExecutionException executionException) {
            FuturesGetChecked.wrapAndThrowExceptionOrError(executionException.getCause(), clazz);
            object = new AssertionError();
            throw object;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw FuturesGetChecked.newWithCause(clazz, interruptedException);
        }
    }

    public static Object getChecked(Future future, Class clazz) {
        return FuturesGetChecked.getChecked(FuturesGetChecked.bestGetCheckedTypeValidator(), future, clazz);
    }

    public static Object getChecked(Future object, Class clazz, long l2, TimeUnit timeUnit) {
        FuturesGetChecked$GetCheckedTypeValidator futuresGetChecked$GetCheckedTypeValidator = FuturesGetChecked.bestGetCheckedTypeValidator();
        futuresGetChecked$GetCheckedTypeValidator.validateClass(clazz);
        try {
            return object.get(l2, timeUnit);
        }
        catch (ExecutionException executionException) {
            FuturesGetChecked.wrapAndThrowExceptionOrError(executionException.getCause(), clazz);
            object = new AssertionError();
            throw object;
        }
        catch (TimeoutException timeoutException) {
            throw FuturesGetChecked.newWithCause(clazz, timeoutException);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw FuturesGetChecked.newWithCause(clazz, interruptedException);
        }
    }

    private static boolean hasConstructorUsableByGetChecked(Class clazz) {
        Exception exception = new Exception();
        try {
            FuturesGetChecked.newWithCause(clazz, exception);
            return true;
        }
        catch (Error | RuntimeException throwable) {
            return false;
        }
    }

    public static boolean isCheckedException(Class clazz) {
        return RuntimeException.class.isAssignableFrom(clazz) ^ true;
    }

    private static /* synthetic */ Comparable lambda$static$0(List list) {
        return Boolean.valueOf(list.contains(String.class));
    }

    private static /* synthetic */ Comparable lambda$static$1(List list) {
        return Boolean.valueOf(list.contains(Throwable.class));
    }

    private static /* synthetic */ List lambda$static$2(Constructor constructor) {
        return Arrays.asList(constructor.getParameterTypes());
    }

    private static Object newFromConstructor(Constructor constructor, Throwable throwable) {
        int n3;
        Class<?>[] classArray = constructor.getParameterTypes();
        int n4 = classArray.length;
        Object[] objectArray = new Object[n4];
        for (int i3 = 0; i3 < (n3 = classArray.length); ++i3) {
            Class<?> clazz = classArray[i3];
            Class clazz2 = String.class;
            boolean bl2 = clazz.equals(clazz2);
            if (bl2) {
                objectArray[i3] = clazz = throwable.toString();
                continue;
            }
            clazz2 = Throwable.class;
            n3 = (int)(clazz.equals(clazz2) ? 1 : 0);
            if (n3 != 0) {
                objectArray[i3] = throwable;
                continue;
            }
            return null;
        }
        try {
            return constructor.newInstance(objectArray);
        }
        catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException exception) {
            return null;
        }
    }

    private static Exception newWithCause(Class object, Throwable throwable) {
        Serializable serializable;
        boolean bl2;
        Object object2 = FuturesGetChecked.preferringStringsThenThrowables(Arrays.asList(((Class)object).getConstructors())).iterator();
        while (bl2 = object2.hasNext()) {
            serializable = (Exception)FuturesGetChecked.newFromConstructor((Constructor)object2.next(), throwable);
            if (serializable == null) continue;
            object = ((Throwable)serializable).getCause();
            if (object == null) {
                ((Throwable)serializable).initCause(throwable);
            }
            return serializable;
        }
        serializable = new StringBuilder("No appropriate constructor for exception of type ");
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(" in response to chained exception");
        object = ((StringBuilder)serializable).toString();
        object2 = new IllegalArgumentException((String)object, throwable);
        throw object2;
    }

    private static List preferringStringsThenThrowables(List list) {
        return WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM.sortedCopy(list);
    }

    public static FuturesGetChecked$GetCheckedTypeValidator weakSetValidator() {
        return FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator.INSTANCE;
    }

    private static void wrapAndThrowExceptionOrError(Throwable throwable, Class serializable) {
        boolean bl2 = throwable instanceof Error;
        if (!bl2) {
            bl2 = throwable instanceof RuntimeException;
            if (bl2) {
                serializable = new UncheckedExecutionException(throwable);
                throw serializable;
            }
            throw FuturesGetChecked.newWithCause(serializable, throwable);
        }
        throwable = (Error)throwable;
        serializable = new ExecutionError((Error)throwable);
        throw serializable;
    }
}

