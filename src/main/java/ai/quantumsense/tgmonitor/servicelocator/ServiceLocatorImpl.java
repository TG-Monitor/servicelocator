package ai.quantumsense.tgmonitor.servicelocator;

import ai.quantumsense.tgmonitor.backend.Interactor;
import ai.quantumsense.tgmonitor.monitor.LoginCodePrompt;
import ai.quantumsense.tgmonitor.monitor.entities.Emails;
import ai.quantumsense.tgmonitor.monitor.entities.Patterns;

public class ServiceLocatorImpl implements ServiceLocator {

    private Patterns patterns = null;
    private Emails emails = null;
    private Interactor interactor = null;
    private LoginCodePrompt loginCodePrompt = null;

    @Override
    public void registerPatternsRepo(Patterns patterns) {
        this.patterns = patterns;
    }

    @Override
    public Patterns getPatternsRepo() {
        if (patterns == null)
            fail("Patterns");
        return patterns;
    }

    @Override
    public void registerEmailsRepo(Emails emails) {
        this.emails = emails;
    }

    @Override
    public Emails getEmailsRepo() {
        if (emails == null)
            fail("Emails");
        return emails;
    }

    @Override
    public void registerInteractor(Interactor interactor) {
        this.interactor = interactor;
    }

    @Override
    public Interactor getInteractor() {
        if (interactor == null)
            fail("Interactor");
        return interactor;
    }

    @Override
    public void registerLoginCodePrompt(LoginCodePrompt loginCodePrompt) {
        this.loginCodePrompt = loginCodePrompt;
    }

    @Override
    public LoginCodePrompt getLoginCodePrompt() {
        if (loginCodePrompt == null)
            fail("LoginCodePrompt");
        return loginCodePrompt;
    }

    private void fail(String service) {
        throw new RuntimeException("Attempting to get " + service + " service, but has not yet been registered");
    }
}
