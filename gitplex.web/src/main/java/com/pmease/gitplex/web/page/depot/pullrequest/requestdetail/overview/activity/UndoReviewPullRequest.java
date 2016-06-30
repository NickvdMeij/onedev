package com.pmease.gitplex.web.page.depot.pullrequest.requestdetail.overview.activity;

import org.apache.wicket.markup.html.panel.Panel;

import com.pmease.gitplex.core.entity.PullRequestActivity;

@SuppressWarnings("serial")
public class UndoReviewPullRequest extends AbstractRenderableActivity {

	public UndoReviewPullRequest(PullRequestActivity activity) {
		super(activity);
	}
	
	@Override
	public Panel render(String panelId) {
		return new UndoReviewActivityPanel(panelId, this);
	}

}