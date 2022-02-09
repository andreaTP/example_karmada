package io.karmada.work.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusters","propagateDeps","replicaRequirements","replicas","requiredBy","resource"})
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
public class ClusterResourceBindingSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    private java.util.List<ClustersSpec> clusters;

    public java.util.List<ClustersSpec> getClusters() {
        return clusters;
    }

    public void setClusters(java.util.List<ClustersSpec> clusters) {
        this.clusters = clusters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("propagateDeps")
    private Boolean propagateDeps;

    public Boolean getPropagateDeps() {
        return propagateDeps;
    }

    public void setPropagateDeps(Boolean propagateDeps) {
        this.propagateDeps = propagateDeps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaRequirements")
    private ReplicaRequirementsSpec replicaRequirements;

    public ReplicaRequirementsSpec getReplicaRequirements() {
        return replicaRequirements;
    }

    public void setReplicaRequirements(ReplicaRequirementsSpec replicaRequirements) {
        this.replicaRequirements = replicaRequirements;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requiredBy")
    private java.util.List<RequiredBySpec> requiredBy;

    public java.util.List<RequiredBySpec> getRequiredBy() {
        return requiredBy;
    }

    public void setRequiredBy(java.util.List<RequiredBySpec> requiredBy) {
        this.requiredBy = requiredBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @javax.validation.constraints.NotNull()
    private ResourceSpec resource;

    public ResourceSpec getResource() {
        return resource;
    }

    public void setResource(ResourceSpec resource) {
        this.resource = resource;
    }
}
