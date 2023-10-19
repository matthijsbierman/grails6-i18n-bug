package com.example
import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import org.springframework.context.MessageSource
import spock.lang.Specification

@Integration
@Rollback
class MessageSpec extends Specification {

    MessageSource messageSource

    void "test message bundle"() {
        expect:
        'Test' == messageSource.getMessage('app.message', null, Locale.ENGLISH)
    }

}
