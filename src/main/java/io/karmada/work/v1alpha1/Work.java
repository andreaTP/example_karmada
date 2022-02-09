package io.karmada.work.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version("v1alpha1")
@io.fabric8.kubernetes.model.annotation.Group("work.karmada.io")
public class Work extends io.fabric8.kubernetes.client.CustomResource<WorkSpec, WorkStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}
