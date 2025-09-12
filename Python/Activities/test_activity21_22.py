import pytest


def test_addition():
    a=10
    b=20
    Sum =a+b
    assert Sum ==30


def test_subraction():
    a=50
    b=20
    Difference =a-b
    assert Difference ==30

@pytest.mark.activity
def test_multiplication():
    a=5
    b=6
    Product =a*b
    assert Product ==30

@pytest.mark.activity
def test_division():
    a=6
    b=3
    Quotient =a/b
    assert Quotient ==2