package io.karmada.policy.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterAffinity","clusterTolerations","replicaScheduling","spreadConstraints"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@lombok.Setter()
@lombok.experimental.Accessors(prefix = {
    "_",
    ""
})
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class PlacementSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusterAffinity")
    private ClusterAffinitySpec clusterAffinity;

    public ClusterAffinitySpec getClusterAffinity() {
        return clusterAffinity;
    }

    public void setClusterAffinity(ClusterAffinitySpec clusterAffinity) {
        this.clusterAffinity = clusterAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterTolerations")
    private java.util.List<ClusterTolerationsSpec> clusterTolerations;

    public java.util.List<ClusterTolerationsSpec> getClusterTolerations() {
        return clusterTolerations;
    }

    public void setClusterTolerations(java.util.List<ClusterTolerationsSpec> clusterTolerations) {
        this.clusterTolerations = clusterTolerations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaScheduling")
    private ReplicaSchedulingSpec replicaScheduling;

    public ReplicaSchedulingSpec getReplicaScheduling() {
        return replicaScheduling;
    }

    public void setReplicaScheduling(ReplicaSchedulingSpec replicaScheduling) {
        this.replicaScheduling = replicaScheduling;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spreadConstraints")
    private java.util.List<SpreadConstraintsSpec> spreadConstraints;

    public java.util.List<SpreadConstraintsSpec> getSpreadConstraints() {
        return spreadConstraints;
    }

    public void setSpreadConstraints(java.util.List<SpreadConstraintsSpec> spreadConstraints) {
        this.spreadConstraints = spreadConstraints;
    }
}
