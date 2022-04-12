#include <iostream>
using namespace std;

// Tree traversal in C++
// Node for tree traversal
struct Node
{
    int data;
    struct Node *left, *right;
    Node(int data)
    {
        this->data = data;
        left = right = NULL;
    }
};

// Preorder traversal
void preorderTraversal(struct Node *node)
{
    if (node == NULL)
        return;

    cout << node->data << "->";
    preorderTraversal(node->left);
    preorderTraversal(node->right);
}

// Postorder traversal

void postorderTraversal(struct Node *node)
{
    if (node == NULL)
        return;
    postorderTraversal(node->left);
    postorderTraversal(node->right);
    cout << node->data << "->";
}

// Inorder traversal
void inorderTraversal(struct Node *node)
{
    if (node == NULL)
        return;

    inorderTraversal(node->left);
    cout << node->data << "->";
    inorderTraversal(node->right);
}

int main()
{
    struct Node *root = new Node(1);
    root->left = new Node(12);
    root->right = new Node(9);
    root->left->left = new Node(5);
    root->left->right = new Node(6);

    cout << "Inorder Traversal ";
    inorderTraversal(root);

    cout << "Preorder Traversal ";
    preorderTraversal(root);

    cout << "\nPostorder Traversal ";
    postorderTraversal(root);
}