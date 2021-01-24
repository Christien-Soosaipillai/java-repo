package com.christien.googleguice.introduction.usingdependencyinjection.modules;

import com.christien.googleguice.introduction.usingdependencyinjection.services.*;
import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TransactionLog.class).to(TemporaryLogger.class);
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        bind(BillingService.class).to(ChuckeyCheeseBillingService.class);
    }
}
