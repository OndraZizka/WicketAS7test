package org.jboss.wicket.test1.pages;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters)
    {
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		add(new BookmarkablePageLink("ejbLink-insert", InsertContact.class));
		add(new BookmarkablePageLink("ejbLink-list", ListContacts.class));
    }
}
