# java-beginners-problems

A set of partially-completed java code blocks and requirements to be completed with unit test to check solution correctness.

## Getting Started

1. Create IAM resources for lab student:

    ```sh
    group=students
    user=student
    password=password

    aws iam create-group --group-name $group
    aws iam put-group-policy --group-name $group --policy-name "lab" --policy-document file://./infrastructure/policy.json
    aws iam create-user --user-name $user
    aws iam create-login-profile --user-name $user --password $password
    aws iam add-user-to-group --group-name $group --user-name $user
    ```

1. Deploy CloudFormation template in `infrastructure/cloudformation.yaml`.

## Tearing Down

1. Delete CloudFormation stack.

1. Delete IAM resources for lab student:

    ```sh
    aws iam remove-user-from-group --group-name $group --user-name $user
    aws iam delete-login-profile --user-name $user
    aws iam delete-user --user-name $user
    aws iam delete-group-policy --group-name $group --policy-name "lab" 
    aws iam delete-group --group-name $group
    ```