package io.onedev.server.buildspec.job;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.jgit.lib.ObjectId;

import io.onedev.k8shelper.CacheInstance;
import io.onedev.server.model.Build;
import io.onedev.server.model.Project;

public interface JobManager {
	
	public static final String JOB_TOKEN_HTTP_HEADER = "X-ONEDEV-JOB-TOKEN";
	
	Build submit(Project project, ObjectId commitId, String jobName, Map<String, List<String>> paramMap);
	
	void resubmit(Build build, Map<String, List<String>> paramMap);
	
	void cancel(Build build);
	
	JobContext getJobContext(String jobToken, boolean mustExist);
	
	Map<CacheInstance, String> allocateJobCaches(String jobToken, Date currentTime, 
			Map<CacheInstance, Date> cacheInstances);
	
	void reportJobCaches(String jobToken, Collection<CacheInstance> cacheInstances);
	
}
